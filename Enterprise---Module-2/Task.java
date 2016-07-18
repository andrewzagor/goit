package EnterpriseModule2;

/**
 * Created by ZahornyiAI on 15.07.2016.
 */
public interface Task <T> {
    void execute();
    T getResult();
}
