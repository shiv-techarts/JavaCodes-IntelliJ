/**
 * Created by shiv on 26/1/17.
 */
public class EmtyBST<T extends Comparable> implements BSTree<T> {

    public EmtyBST() {
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(T element) {
        return false;
    }

    @Override
    public NonEmptyBST<T> add(T element) {
        return ( new NonEmptyBST<T>(element) );
    }
}
