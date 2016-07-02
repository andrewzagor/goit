package Enterprise;

import java.util.ArrayList;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class TreeSet10k {
    public static ArrayList resultHashSet () {
        TreeSetMethods treeSetMethods = new TreeSetMethods();
        int a = 10000;

        long add = treeSetMethods.treeSetAdd(a);
        long remove = treeSetMethods.treeSetRemove(a);
        long contains = treeSetMethods.treeSetContains(a);
        long populate = treeSetMethods.treeSetPopulate(a);

        ArrayList result = new ArrayList();
        result.add("TreeSet");
        result.add(add);
        result.add(remove);
        result.add(contains);
        result.add(populate);

        return result;
    }
}
