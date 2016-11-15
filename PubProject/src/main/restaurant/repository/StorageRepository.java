package restaurant.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import restaurant.domain.Storage;

import java.util.List;

/**
 * Created by zagor on 06.11.2016.
 */
@Repository
@Transactional
public class StorageRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public void addStorage (Storage storage){
        this.sessionFactory.getCurrentSession().save(storage);
    }

    public List<Storage> listAll() {

        return this.sessionFactory.getCurrentSession().createQuery("from Storage").list();
    }

    public List<Storage> findByName(String name) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Storage d where d.name_product like :name");
        query.setParameter("name", name);
        return ((List<Storage>) query.uniqueResult());
    }

    public Storage findById(Integer id) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Storage d where d.name_product like :id");
        query.setParameter("id", id);
        return ((Storage) query.uniqueResult());
    }

    public void removeStorage (Integer id ) {
        Storage storage = (Storage) this.sessionFactory.getCurrentSession().load (Storage.class, id);
        if (null != storage) {
            this.sessionFactory.getCurrentSession().delete (storage);
        }
    }

    public Storage get(Integer id ) {
        Session session = sessionFactory.getCurrentSession();
        Storage storage = (Storage) session.get(Storage.class, id);
        return storage;
    }

    public void editStorage(Storage storage) {
        Session session = sessionFactory.getCurrentSession();
        Storage existingStorage = (Storage) session.get(Storage.class, storage.getId());
        existingStorage.setName_product(storage.getName_product());
        existingStorage.setCount(storage.getCount());

        session.save(existingStorage);

    }
}
