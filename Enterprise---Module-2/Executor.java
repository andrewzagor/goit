package Module_2_Enterprise;

import java.util.List;

/**
 * Created by zagor on 23.08.2016.
 */
public interface Executor<T extends List<Integer>> {
    void addTask(Task<? extends T> task);
    void addTask(Task<? extends T> task, Validator<? super T> validator);
    void execute ();
    List<T> getValidResults();
    List<T> getInvalidResults();
}
