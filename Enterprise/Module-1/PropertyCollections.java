package Enterprise;

/**
 * Created by ZahornyiAI on 02.07.2016.
 */
public class PropertyCollections {
    String name;
    long add;
    long get;
    long remove;
    long contains;
    long populate;
    long iteratorAdd;
    long iteratorRemove;

    public PropertyCollections (String name, long add, long get, long remove, long contains, long populate, long iteratorAdd, long iteratorRemove) {
        this.name = name;
        this.add = add;
        this.get = get;
        this.remove = remove;
        this.contains = contains;
        this.populate = populate;
        this.iteratorAdd = iteratorAdd;
        this.iteratorRemove = iteratorRemove;
    }

    public String getName() {
        return name;
    }

    public long getAdd() {
        return add;
    }

    public long getGet() {
        return get;
    }

    public long getRemove() {
        return remove;
    }

    public long getContains() {
        return contains;
    }

    public long getPopulate() {
        return populate;
    }

    public long getIteratorAdd() {
        return iteratorAdd;
    }

    public long getIteratorRemove() {
        return iteratorRemove;
    }
}
