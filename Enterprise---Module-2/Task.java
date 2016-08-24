package Module_2_Enterprise;

/**
 * Created by zagor on 23.08.2016.
 */
public interface Task <T> {
    void execute();
    T getResult();

    boolean isExecuted();
}
