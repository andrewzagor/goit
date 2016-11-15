package restaurant.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import restaurant.domain.Drink;
import restaurant.domain.PubMenu;

import java.util.List;

/**
 * Created by zagor on 25.09.2016.
 */
@Repository
@Transactional
public class PubMenuRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public List<PubMenu> listAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from PubMenu").list();
    }

    public List<PubMenu> listLight() {
        return this.sessionFactory.getCurrentSession().createQuery("from PubMenu where kindOfBeer='light'").list();
    }

    public List<PubMenu> listDark() {
        return this.sessionFactory.getCurrentSession().createQuery("from PubMenu where kindOfBeer='dark'").list();
    }

    public List<PubMenu> listUnfiltered() {
        return this.sessionFactory.getCurrentSession().createQuery("from PubMenu where kindOfBeer='unfiltered'").list();
    }

    public PubMenu getBeerByNameLight(String PubMenuLightName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select n from PubMenu n where n.name like :name and kindOfBeer='light'");
        query.setParameter("name", PubMenuLightName);
        return (PubMenu) query.uniqueResult();
    }

    public PubMenu getBeerByNameDark(String PubMenuDarkName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select n from PubMenu n where n.name like :name and kindOfBeer='dark'");
        query.setParameter("name", PubMenuDarkName);
        return (PubMenu) query.uniqueResult();
    }

    public PubMenu getBeerByNameLightUnfiltered(String PubMenuUnfilteredName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select n from PubMenu n where n.name like :name and kindOfBeer='unfiltered'");
        query.setParameter("name", PubMenuUnfilteredName);
        return (PubMenu) query.uniqueResult();
    }

    public PubMenu get( Integer id ) {

        Session session = sessionFactory.getCurrentSession();
        PubMenu pubMenu = (PubMenu) session.get(PubMenu.class, id);

        return pubMenu;
    }

    public void addBeer(PubMenu pubMenu) {
        this.sessionFactory.getCurrentSession().save(pubMenu);
    }

    public void editBeer(PubMenu pubMenu) {
        Session session = sessionFactory.getCurrentSession();
        PubMenu existingPubMenu = (PubMenu) session.get(PubMenu.class, pubMenu.getId());
        existingPubMenu.setName(pubMenu.getName());
        existingPubMenu.setKindOfBeer(pubMenu.getKindOfBeer());
        existingPubMenu.setVolume(pubMenu.getVolume());
        existingPubMenu.setPrice(pubMenu.getPrice());
        existingPubMenu.setDescription(pubMenu.getDescription());

        session.save(existingPubMenu);

    }

    public void removeBeer(Integer id) {
        PubMenu beer = (PubMenu) this.sessionFactory.getCurrentSession().load(PubMenu.class, id);
        if (null != beer) {
            this.sessionFactory.getCurrentSession().delete(beer);
        }
    }

    public List<PubMenu> findByName(String name) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from PubMenu d where d.name like :name");
        query.setParameter("name", name);
        return ((List<PubMenu>) query.uniqueResult());
    }

    public PubMenu findById(Integer id) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from PubMenu d where d.id like :id");
        query.setParameter("id", id);
        return ((PubMenu) query.uniqueResult());
    }
}
