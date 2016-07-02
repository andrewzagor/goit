package Enterprise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class LinkedListMethods {

    public static long linkedListPopulate(int size) {

        long timePopulate = 0;
        int count = 100;
        int j = 1;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999 + 1);
        }
        LinkedList linkedList = new LinkedList();

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            for (int i = 0; i < array.length; i++) {
                linkedList.add(array[i]);
            }
            end = System.nanoTime();
            dif = end - start;
            timePopulate = timePopulate + dif;
            linkedList.clear();
            j++;
        }
        return timePopulate/count;
    }

    public static long linkedListContains(int size) {

        long timeContains = 0;
        int count = 100;
        int j = 1;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999 + 1);
        }

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            boolean test = linkedList.contains(2000);
            end = System.nanoTime();
            dif = end - start;
            timeContains = timeContains + dif;
            j++;
        }
        return timeContains/count;
    }

    public static long linkedListAdd (int size){
        long timeAdd = 0;
        int count = 100;
        int j = 1;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999 + 1);
        }

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            linkedList.add(55555);
            end = System.nanoTime();
            dif = end - start;
            timeAdd = timeAdd + dif;
            j++;
        }
        return timeAdd/count;
    }

    public static long linkedListRemove (int size) {
        long timeRemove = 0;
        int count = 100;
        int j = 1;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999 + 1);
        }

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            linkedList.remove(7896);
            end = System.nanoTime();
            dif = end - start;
            timeRemove = timeRemove + dif;
            j++;
        }
        return timeRemove/count;
    }

    public static long linkeListGet (int size) {
        long timeGet = 0;
        int count = 100;
        int j = 1;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999 + 1);
        }

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            linkedList.get(4589);
            end = System.nanoTime();
            dif = end - start;
            timeGet = timeGet + dif;
            j++;
        }
        return timeGet/count;
    }

    public static long linkedListIteratorAdd (int size){

        long timeIterAdd = 0;
        int count = 100;
        int j = 1;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999 + 1);
        }

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }

        ListIterator<Integer> listIter = linkedList.listIterator();

        while (j != count) {
            long start, end, dif;
            start = System.nanoTime();
            listIter.add(8654);
            end = System.nanoTime();
            dif = end - start;
            timeIterAdd = timeIterAdd + dif;
            j++;
        }
        return timeIterAdd/count;
    }

    public static long linkedListIteratorRemove (int size){

        long timeIterRemove = 0;
        int count = 100;
        int j = 1;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9999 + 1);
        }

        LinkedList linkedList = new LinkedList();

        for (int i = 0; i < array.length; i++) {
            linkedList.add(array[i]);
        }

        ListIterator<Integer> listIter = linkedList.listIterator();

        while (j != count) {
            long start, end, dif;
            listIter.next();
            start = System.nanoTime();
            listIter.remove();
            end = System.nanoTime();
            dif = end - start;
            timeIterRemove = timeIterRemove + dif;
            j++;
        }
        return timeIterRemove/count;
    }
}
