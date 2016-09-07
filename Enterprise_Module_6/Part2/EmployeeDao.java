import java.util.List;

/**
 * Created by zagor on 07.09.2016.
 */
public interface EmployeeDao {

    Employee load(int id);

    List<Employee> getAll();
}
