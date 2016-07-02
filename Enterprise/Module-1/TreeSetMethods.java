package Enterprise;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class TreeSetMethods {

    public static long treeSetPopulate (int size) {
        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer tempInt;

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            while (treeSet.size() < size) {
                while (treeSet.contains(tempInt = r.nextInt(size))) ;
                treeSet.add(tempInt);}
            end = System.nanoTime();
            dif = end - start;
            timePopulate = timePopulate + dif;
            treeSet.clear();
            j++;
        }
        return timePopulate/count;
    }

    public static long treeSetContains (int size) {
        long timeContains = 0;
        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer tempInt;
        while (treeSet.size() < size) {
            while (treeSet.contains(tempInt = r.nextInt(size))) ;
            treeSet.add(tempInt);}

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            boolean test = treeSet.contains(2000);
            end = System.nanoTime();
            dif = end - start;
            timeContains = timeContains + dif;
            j++;
        }
        return (timeContains/count);
    }

    public static long treeSetAdd (int size) {
        long timeAdd = 0;
        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer tempInt;
        while (treeSet.size() < size) {
            while (treeSet.contains(tempInt = r.nextInt(size))) ;
            treeSet.add(tempInt);}

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            treeSet.add(50000);
            end = System.nanoTime();
            dif = end - start;
            timeAdd = timeAdd + dif;
            j++;
        }
        return timeAdd/count;
    }

    public static long treeSetRemove (int size) {
        long timeRemove = 0;

        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        TreeSet<Integer> treeSet = new TreeSet<>();
        Integer tempInt;
        while (treeSet.size() < size) {
            while (treeSet.contains(tempInt = r.nextInt(size))) ;
            treeSet.add(tempInt);}

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            treeSet.remove(5000);
            end = System.nanoTime();
            dif = end - start;
            timeRemove = timeRemove + dif;
            j++;
        }
        return timeRemove/count;
    }
}
