package Enterprise;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class Run {
    public static void main(String[] args) {
        ArrayListMethods arrayListMethods = new ArrayListMethods();
        /*System.out.println(arrayListMethods.arrListPopulate());
        System.out.println(arrayListMethods.arrListContains());
        System.out.println(arrayListMethods.arrListAdd());
        System.out.println(arrayListMethods.arrListRemove());
        System.out.println(arrayListMethods.arrListGet());
        System.out.println(arrayListMethods.arrListIteratorAdd());
        System.out.println(arrayListMethods.arrListIteratorRemove());*/

        ArrayList10k arrayList10k = new ArrayList10k();
        System.out.println(arrayList10k.resultArrayList());

        ArrayList100k arrayList100k = new ArrayList100k();
        System.out.println(arrayList100k.resultArrayList());

        ArrayList1000k arrayList1000k = new ArrayList1000k();
        System.out.println(arrayList1000k.resultArrayList());

        /*LinkedList10k linkedList10k = new LinkedList10k();
        System.out.println(linkedList10k.resultLinkedList());

        Linkedlist100k linkedlist100k = new Linkedlist100k();
        System.out.println(linkedlist100k.resultLinkedList());

        LinkedList1000k linkedList1000K = new LinkedList1000k();
        System.out.println(linkedList1000K.resultLinkedList());*/

       /* HashSetMethods hashSetMethods = new HashSetMethods();
        System.out.println(hashSetMethods.hashSetPopulate(10000));
        System.out.println(hashSetMethods.hashSetContains(10000));
        System.out.println(hashSetMethods.hashSetAdd(10000));
        System.out.println(hashSetMethods.hashSetRemove(10000));*/

        /*HashSet10k hashSet10k = new HashSet10k();
        System.out.println(hashSet10k.resultHashSet());

        HashSet100k hashSet100k = new HashSet100k();
        System.out.println(hashSet100k.resultHashSet());

        HashSet1000k hashSet1000k = new HashSet1000k();
        System.out.println(hashSet1000k.resultHashSet());*/

        /*TreeSet10k treeSet10k = new TreeSet10k();
        System.out.println(treeSet10k.resultHashSet());

        TreeSet100k treeSet100k = new TreeSet100k();
        System.out.println(treeSet100k.resultHashSet());

        TreeSet1000k treeSet1000k = new TreeSet1000k();
        System.out.println(treeSet1000k.resultHashSet());*/
    }
}
