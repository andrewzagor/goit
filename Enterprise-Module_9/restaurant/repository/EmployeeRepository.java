package restaurant.repository;

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
}
