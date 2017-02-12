/**
 * Created by shiv on 26/1/17.
 */
public class NonEmptyBST<T extends Comparable> implements BSTree<T> {

    T data;
    BSTree<T> left;
    BSTree<T> right;

    public NonEmptyBST(T element) {
        data = element;
        left = new EmtyBST<T>();
        right = new EmtyBST<T>();
    }

    public NonEmptyBST(T data, BSTree<T> left, BSTree<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return ( 1 + left.cardinality() + right.cardinality() );
    }

    @Override
    public boolean member(T element) {
        if(data == element) {
            return true;
        } else {
            if(element.compareTo(data) < 0 ) {
                return left.member(element);
            } else {
                return right.member(element);
            }
        }
        //return false;
    }

    @Override
    public NonEmptyBST<T> add(T element) {
        if(data == element) {
            return this;
        } else {
            if(element.compareTo(data) < 0) {
                return ( new NonEmptyBST<T>(element, left.add(element), right) );
            } else {
                return ( new NonEmptyBST<T>(element, right.add(element), left) );
            }
        }
    }
}
