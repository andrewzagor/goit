package Enterprise;

import java.util.ArrayList;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class Linkedlist100k {
    public static ArrayList resultLinkedList () {
        int a = 100000;
        LinkedListMethods linkedList = new LinkedListMethods();
        long add = linkedList.linkedListAdd(a);
        long get = linkedList.linkeListGet(a);
        long remove = linkedList.linkedListRemove(a);
        long contains = linkedList.linkedListContains(a);
        long populate = linkedList.linkedListPopulate(a);
        long iteratorAdd = linkedList.linkedListIteratorAdd(a);
        long iteratorRemove = linkedList.linkedListIteratorRemove(a);

        ArrayList result = new ArrayList();
        result.add("LinkedList");
        result.add(add);
        result.add(get);
        result.add(remove);
        result.add(contains);
        result.add(populate);
        result.add(iteratorAdd);
        result.add(iteratorRemove);

        return result;
    }
}
