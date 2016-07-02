package Enterprise;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class HashSetMethods {

    public static long hashSetPopulate (int size) {
        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        Integer tempInt;

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            while (hashSet.size() < size) {
                while (hashSet.contains(tempInt = r.nextInt(size))) ;
                hashSet.add(tempInt);}
                end = System.nanoTime();
                dif = end - start;
                timePopulate = timePopulate + dif;
                hashSet.clear();
                j++;
            }
        return timePopulate/count;
    }

    public static long hashSetContains (int size) {
        long timeContains = 0;
        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        Integer tempInt;
        while (hashSet.size() < size) {
            while (hashSet.contains(tempInt = r.nextInt(size))) ;
            hashSet.add(tempInt);}

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            boolean test = hashSet.contains(2000);
            end = System.nanoTime();
            dif = end - start;
            timeContains = timeContains + dif;
            j++;
        }
        return (timeContains/count);
    }

    public static long hashSetAdd (int size) {
        long timeAdd = 0;
        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        Integer tempInt;
        while (hashSet.size() < size) {
            while (hashSet.contains(tempInt = r.nextInt(size))) ;
            hashSet.add(tempInt);}

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            hashSet.add(50000);
            end = System.nanoTime();
            dif = end - start;
            timeAdd = timeAdd + dif;
            j++;
        }
        return timeAdd/count;
    }

    public static long hashSetRemove (int size) {
        long timeRemove = 0;

        long timePopulate = 0;
        int count = 100;
        int j = 1;

        Random r = new Random();
        HashSet<Integer> hashSet = new HashSet<>();
        Integer tempInt;
        while (hashSet.size() < size) {
            while (hashSet.contains(tempInt = r.nextInt(size))) ;
            hashSet.add(tempInt);}

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            hashSet.remove(5000);
            end = System.nanoTime();
            dif = end - start;
            timeRemove = timeRemove + dif;
            j++;
        }
        return timeRemove/count;
    }
}
