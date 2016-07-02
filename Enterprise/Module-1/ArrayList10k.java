package Enterprise;

import java.util.ArrayList;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class ArrayList10k {
    public static ArrayList resultArrayList () {
        ArrayListMethods arrayListMethods = new ArrayListMethods();
        int a = 10000;
        long add = arrayListMethods.arrListAdd(a);
        long get = arrayListMethods.arrListGet(a);
        long remove = arrayListMethods.arrListRemove(a);
        long contains = arrayListMethods.arrListContains(a);
        long populate = arrayListMethods.arrListPopulate(a);
        long iteratorAdd = arrayListMethods.arrListIteratorAdd(a);
        long iteratorRemove = arrayListMethods.arrListIteratorRemove(a);

        ArrayList result = new ArrayList();
        result.add("ArrayList");
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
