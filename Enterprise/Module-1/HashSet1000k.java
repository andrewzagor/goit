package Enterprise;

import java.util.ArrayList;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class HashSet1000k {
    public static ArrayList resultHashSet () {
        HashSetMethods hashSetMethods = new HashSetMethods();
        int a = 1000000;

        long add = hashSetMethods.hashSetAdd(a);
        long remove = hashSetMethods.hashSetRemove(a);
        long contains = hashSetMethods.hashSetContains(a);
        long populate = hashSetMethods.hashSetPopulate(a);

        ArrayList result = new ArrayList();
        result.add("HashSet");
        result.add(add);
        result.add(remove);
        result.add(contains);
        result.add(populate);

        return result;
    }
}
