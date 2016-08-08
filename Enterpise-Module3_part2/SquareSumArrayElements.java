package EnterpriseModule31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Phaser;
import java.util.stream.IntStream;

/**
 * Created by ZahornyiAI on 08.08.2016.
 */
public class SquareSumArrayElements implements SquareSum {

    public static void main(String[] args) {

        SquareSumArrayElements squareSumArrayElements = new SquareSumArrayElements();
        System.out.println("Result: "+ squareSumArrayElements.getSquareSum(rndIntArray(100), 3));
    }

    private static int[] rndIntArray(int size) {
        int[] result = new int[size];
        IntStream.range(0, size).forEach((i) -> result[i] = (int) (Math.random() * 100));
        System.out.println("Array was generated");
        return result;
    }

    @Override
    public long getSquareSum(int[] values, int numberOfThreads) {
        Phaser phaser = new Phaser(1);
        List<SquareSumThread> threads = new ArrayList<>();

        IntStream.range(0, numberOfThreads).forEach((i) ->
                threads.add(new SquareSumThread(partsOfArray(values, numberOfThreads, i), phaser)));
        threads.forEach(Thread::start);

        IntStream.range(0, 2).forEach((i) -> phaser.arriveAndAwaitAdvance());

        return threads.stream().mapToLong(SquareSumThread::getResult).sum();
    }

    private int[] partsOfArray(int[] partArray, int partsCount, int partForReturn) {
        int[][] result = new int[partsCount][];
        int partLength = partArray.length / partsCount;
        int lastPartLength = partLength + partArray.length % partsCount;

        for (int i = 0; i < partsCount; i++) {
            result[i] = new int[i == partsCount - 1 ? lastPartLength : partLength];
            System.arraycopy(partArray, partLength * i, result[i], 0, i == partsCount - 1 ? lastPartLength : partLength);
        }

        return result[partForReturn];
    }

    class SquareSumThread extends Thread {

        private int[] values;
        private Phaser phaser;
        private long result;

        SquareSumThread(int[] values, Phaser phaser) {
            this.values = Arrays.copyOf(values, values.length);
            this.phaser = phaser;
            phaser.register();
        }

        @Override
        public void run() {
            IntStream.range(0, values.length).forEach((i) -> values[i] *= values[i]);
            System.out.println(Thread.currentThread().getName() + ": square operation completed");
            phaser.arriveAndAwaitAdvance();

            result = Arrays.stream(values).sum();
            System.out.println(Thread.currentThread().getName() + ": summ operation completed");
            phaser.arriveAndDeregister();
        }

        public long getResult() {
            return result;
        }
    }
}
