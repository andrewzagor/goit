package Module_2_Enterprise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by zagor on 24.08.2016.
 */
public class MainExecuteTest {
    @org.junit.Test
    public void addTask() throws Exception {
        MainExecute<ArrayList<Integer>> executor = new MainExecute<>();
        IntStream.range(0, 10).forEach((i) -> executor.addTask(new MainTask(ArrayList.class)));

        assertEquals(10, executor.getTaskCount());
    }

    @org.junit.Test
    public void addTask1() throws Exception {
        MainExecute<ArrayList<Integer>> executor = new MainExecute<>();
        IntStream.range(0, 10).forEach((i) -> executor.addTask(new MainTask(ArrayList.class), new MainValidator<>()));

        assertEquals(10, executor.getTaskCount());

    }

    @org.junit.Test
    public void getValidResults() throws Exception {
        MainExecute<ArrayList<Integer>> executor = new MainExecute<>();
        IntStream.range(0, 10).forEach((i) -> executor.addTask(new MainTask(ArrayList.class)));
        executor.execute();

        executor.getValidResults().forEach(System.out::println);
    }

    @org.junit.Test
    public void getInvalidResults() throws Exception {
        MainExecute<ArrayList<Integer>> executor = new MainExecute<>();
        IntStream.range(0, 10_000).forEach((i) -> executor.addTask(new MainTask(ArrayList.class), new MainValidator<>()));
        executor.execute();

        List<ArrayList<Integer>> validResults = executor.getValidResults();
        List<ArrayList<Integer>> inValidResults = executor.getInvalidResults();

        for(ArrayList<Integer> arrayList: validResults){
            assertEquals(45, arrayList.stream().mapToInt(value -> value).sum());
        }

        System.out.println("\nValid results: " + validResults.size() + ". Invalid results: " + inValidResults.size());
        validResults.forEach(System.out::println);
    }

}