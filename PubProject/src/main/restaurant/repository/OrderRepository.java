package restaurant.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import restaurant.domain.Order;

import java.util.List;

/**
 * Created by zagor on 14.11.2016.
 */
@Repository
@Transactional
public class OrderRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public void addOrder (Order order){
        this.sessionFactory.getCurrentSession().save(order);
    }

    public List<Order> listAll() {

        return this.sessionFactory.getCurrentSession().createQuery("from Order").list();
    }

    public void removeOrder (Integer id ) {
        Order order = (Order) this.sessionFactory.getCurrentSession().load (Order.class, id);
        if (null != order) {
            this.sessionFactory.getCurrentSession().delete (order);
        }
    }

    public Order get(Integer id ) {
        Session session = sessionFactory.getCurrentSession();
        Order order = (Order) session.get(Order.class, id);
        return order;
    }

    public void editOrder(Order order) {
        Session session = sessionFactory.getCurrentSession();
        Order existingOrder = (Order) session.get(Order.class, order.getId());
        existingOrder.setName_beer(order.getName_beer());
        existingOrder.setCount(order.getCount());
        existingOrder.setPrice(order.getPrice());

        session.save(existingOrder);

    }

    public List<Order> findByName(String name) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Order d where d.name_beer like :name");
        query.setParameter("name", name);
        return ((List<Order>) query.uniqueResult());
    }

    public Order findById(Integer id) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Order d where d.id like :id");
        query.setParameter("id", id);
        return ((Order) query.uniqueResult());
    }
}
