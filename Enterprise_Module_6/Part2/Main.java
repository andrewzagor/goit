/**
 * Created by zagor on 07.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        EmployeeDao jdbcEmployeeDao = new JdbcEmployeeDao();
        System.out.println("All employees:");
        jdbcEmployeeDao.getAll().forEach(System.out::println);

        System.out.println("Employee with id = 4");
        System.out.println(jdbcEmployeeDao.load(4));
    }
}
