/**
 * Created by shiv on 26/1/17.
 */
public interface BSTree<T extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(T element);
    public NonEmptyBST<T> add(T element);
}
