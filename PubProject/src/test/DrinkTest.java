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
import restaurant.domain.Drink;
import restaurant.domain.Storage;
import restaurant.repository.DrinkRepository;
import restaurant.repository.StorageRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zagor on 14.11.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:resources/test-application-context.xml", "classpath:resources/test-hibernate.cfg.xml"})
public class DrinkTest {
    @Autowired
    private SessionFactory sessionFactory;
    private DrinkRepository drinkRepository;
    private Drink drink;

    @Test
    @Transactional
    @Rollback(true)
    public void test() {
        Session session = sessionFactory.getCurrentSession();

        drinkRepository.addDrink(new Drink (1, "Chernigivske"));
        drinkRepository.addDrink(new Drink (2, "Munich"));

        List<List<Drink>> drinkTest = new ArrayList<List<Drink>>();
        drinkTest.add(drinkRepository.findByName("Chernigivske"));
        drinkTest.add(drinkRepository.findByName("Munich"));

        Drink amstel = new Drink(3, "Amstel");
        session.save(amstel);

        Assert.assertEquals("Amstel", drinkRepository.findByName("Amstel"));

        drinkRepository.removeDrink(3);
        drinkRepository.removeDrink(2);
        drinkRepository.removeDrink(1);
    }
}
