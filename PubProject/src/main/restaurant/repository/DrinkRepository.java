package restaurant.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import restaurant.domain.Drink;
import restaurant.domain.Employee;
import restaurant.domain.PubMenu;
import restaurant.domain.Storage;

import java.util.List;

/**
 * Created by zagor on 06.11.2016.
 */
@Repository
@Transactional
public class DrinkRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public void addDrink (Drink drink){
        this.sessionFactory.getCurrentSession().save(drink);
    }

    public List<Drink> listAll() {

        return this.sessionFactory.getCurrentSession().createQuery("from Drink").list();
    }

    public void removeDrink (Integer id ) {
        Drink drink = (Drink) this.sessionFactory.getCurrentSession().load (Drink.class, id);
        if (null != drink) {
            this.sessionFactory.getCurrentSession().delete (drink);
        }
    }

    public Drink get(Integer id ) {
        Session session = sessionFactory.getCurrentSession();
        Drink drink = (Drink) session.get(Drink.class, id);
        return drink;
    }

    public void editDrink(Drink drink) {
        Session session = sessionFactory.getCurrentSession();
        Drink existingDrink = (Drink) session.get(Drink.class, drink.getId());
        existingDrink.setDrink_name(drink.getDrink_name());

        session.save(existingDrink);

    }

    public List<Drink> findByName(String name) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Drink d where d.drink_name like :name");
        query.setParameter("name", name);
        return ((List<Drink>) query.uniqueResult());
    }

    public Drink findById(Integer id) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Drink d where d.drink_name like :id");
        query.setParameter("id", id);
        return ((Drink) query.uniqueResult());
    }
}
