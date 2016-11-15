package restaurant.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import restaurant.domain.Employee;


import java.util.List;

/**
 * Created by zagor on 17.09.2016.
 */
@Repository
@Transactional
public class EmployeeRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void addEmployee (Employee employee){
        this.sessionFactory.getCurrentSession().save(employee);
    }

    public List<Employee> listAll() {
        return this.sessionFactory.getCurrentSession().createQuery("from Employee").list();
    }

    public void removeEmployee (Integer id ) {
        Employee contact = (Employee) this.sessionFactory.getCurrentSession().load (Employee.class, id);
        if (null != contact) {
            this.sessionFactory.getCurrentSession().delete (contact);
        }
    }

    public List<Employee> findByName(String name) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Employee d where d.second_name like :name");
        query.setParameter("name", name);
        return ((List<Employee>) query.uniqueResult());
    }

    public Employee findById(Integer id) {
        final Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select d from Employee d where d.id like :id");
        query.setParameter("id", id);
        return ((Employee) query.uniqueResult());
    }
}
