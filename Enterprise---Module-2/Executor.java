package EnterpriseModule2;

import java.util.List;

/**
 * Created by ZahornyiAI on 15.07.2016.
 */
public interface Executor  {
    void addTask(Task task);
    void addTask(Task task, Validator validator);
    void execute ();
    List<Task> getValidResults();
    List<Task> getInvalidResults();
}
