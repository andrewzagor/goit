package Module_2_Enterprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by zagor on 24.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        MainExecute<ArrayList<Integer>> executor = new MainExecute<>();
        IntStream.range(0, 15000).forEach((i) -> executor.addTask(new MainTask<>(ArrayList.class), new MainValidator<>()));
        executor.addTask(new MainTask<>(ArrayList.class, new ArrayList<>(Arrays.asList(8, 1, 2, 3, 5))), new MainValidator<>());
        executor.addTask(new MainTask<>(ArrayList.class, new ArrayList<>(Arrays.asList(6, 1, 2, 4, 3, 5))), new MainValidator<>());
        executor.execute();

        List<ArrayList<Integer>> validResults = executor.getValidResults();
        List<ArrayList<Integer>> inValidResults = executor.getInvalidResults();

        System.out.println("\nValid results: " + validResults.size() + ". Invalid results: " + inValidResults.size());
        validResults.forEach(System.out::println);
    }
}
