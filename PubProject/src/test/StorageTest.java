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
import restaurant.domain.Storage;
import restaurant.repository.StorageRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zagor on 13.11.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:resources/test-application-context.xml", "classpath:resources/test-hibernate.cfg.xml"})
public class StorageTest {
    @Autowired
    private SessionFactory sessionFactory;
    private StorageRepository storageRepository;
    private Storage storage;

    @Test
    @Transactional
    @Rollback(true)
    public void test() {
        Session session = sessionFactory.getCurrentSession();

        storageRepository.addStorage(new Storage(1, "Chernigivske", 50));
        storageRepository.addStorage(new Storage(2, "Munich", 150));

        List<List<Storage>> storageTest = new ArrayList<List<Storage>>();
        storageTest.add(storageRepository.findByName("Chernigivske"));
        storageTest.add(storageRepository.findByName("Munich"));

        Storage amstel = new Storage(3, "Amstel", 200);
        session.save(amstel);

        Assert.assertEquals("Amstel", storageRepository.findByName("Amstel"));

        storageRepository.removeStorage(3);
        storageRepository.removeStorage(2);
        storageRepository.removeStorage(1);
}}
