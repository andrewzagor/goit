import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import restaurant.domain.Order;
import restaurant.domain.PubMenu;
import restaurant.repository.OrderRepository;
import restaurant.repository.PubMenuRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zagor on 14.11.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:resources/test-application-context.xml", "classpath:resources/test-hibernate.cfg.xml"})
public class OrderTest {
    @Autowired
    private SessionFactory sessionFactory;
    private OrderRepository orderRepository;
    private Order order;

    @Test
    @Transactional
    @Rollback(true)
    public void test() {
        Session session = sessionFactory.getCurrentSession();

        orderRepository.addOrder(new Order (1, "Chernigivske", 5, 250 ));
        orderRepository.addOrder(new Order (2, "Munich", 10, 900 ));

        List<List<Order>> orderTest = new ArrayList<List<Order>>();
        orderTest.add(orderRepository.findByName("Chernigivske"));
        orderTest.add(orderRepository.findByName("Munich"));

        Order amstel = new Order( 3, "Amstel", 20, 1800);
        session.save(amstel);

        Assert.assertEquals("Amstel", orderRepository.findByName("Amstel"));

        orderRepository.removeOrder(3);
        orderRepository.removeOrder(2);
        orderRepository.removeOrder(1);
    }
}
