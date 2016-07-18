package EnterpriseModule2;

import java.util.List;

/**
 * Created by ZahornyiAI on 15.07.2016.
 */
public class Test {
    public void test (List<Task<Integer>> intTasks) {
        Executor<Number> numberExecutor = new Executor<>();

        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);

            numberExecutor.addTask(new Task(10L), new NumberValidator());

            numberExecutor.execute();

            System.out.println("Valid results:");
            for (Number number : numberExecutor.getValidResults()) {
                System.out.println(number);
            }
            System.out.println("Invalid results:");
            for (Number number : numberExecutor.getInvalidResults()) {
                System.out.println(number);
            }
        }
    }
        }
    }
}
