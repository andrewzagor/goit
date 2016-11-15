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
import restaurant.domain.Employee;
import restaurant.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zagor on 14.11.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:resources/test-application-context.xml", "classpath:resources/test-hibernate.cfg.xml"})
public class EmployeeTest {
    @Autowired
    private SessionFactory sessionFactory;
    private EmployeeRepository employeeRepository;
    private Employee employee;

    @Test
    @Transactional
    @Rollback(true)
    public void test() {
        Session session = sessionFactory.getCurrentSession();

        employeeRepository.addEmployee(new Employee (1, "Zlatan","Ibragimovich", 1981,7500, "waitor" ));
        employeeRepository.addEmployee(new Employee (2, "Frank","De Boer", 1970, 13000, "administrator" ));

        List<List<Employee>> employeeTest = new ArrayList<List<Employee>>();
        employeeTest.add(employeeRepository.findByName("Ibragimovich"));
        employeeTest.add(employeeRepository.findByName("De Boer"));

        Employee messi = new Employee( 2, "Lionel","Messi", 1987, 10000, "waitor");
        session.save(messi);

        Assert.assertEquals("Messi", employeeRepository.findByName("Messi"));

        employeeRepository.removeEmployee(3);
        employeeRepository.removeEmployee(2);
        employeeRepository.removeEmployee(1);
    }
}
