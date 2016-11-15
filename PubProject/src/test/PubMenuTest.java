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
import restaurant.domain.Employee;
import restaurant.domain.PubMenu;
import restaurant.repository.PubMenuRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zagor on 14.11.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:resources/test-application-context.xml", "classpath:resources/test-hibernate.cfg.xml"})
public class PubMenuTest {
    @Autowired
    private SessionFactory sessionFactory;
    private PubMenuRepository pubMenuRepository;
    private PubMenu pubMenu;

    @Test
    @Transactional
    @Rollback(true)
    public void test() {
    Session session = sessionFactory.getCurrentSession();

        pubMenuRepository.addBeer(new PubMenu (1, "Chernigivske", "light","0.5L", 5, "test" ));
        pubMenuRepository.addBeer(new PubMenu (2, "Munich", "dark","0.4L", 90, "test" ));

    List<List<PubMenu>> pubmenuTest = new ArrayList<List<PubMenu>>();
        pubmenuTest.add(pubMenuRepository.findByName("Chernigivske"));
        pubmenuTest.add(pubMenuRepository.findByName("Munich"));

    PubMenu amstel = new PubMenu( 3, "Amstel","light", "0.5L",50, "test");
        session.save(amstel);

        Assert.assertEquals("Amstel", pubMenuRepository.findByName("Amstel"));

        pubMenuRepository.removeBeer(3);
        pubMenuRepository.removeBeer(2);
        pubMenuRepository.removeBeer(1);
}
}
