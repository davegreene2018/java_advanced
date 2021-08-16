
package binarytrees;

public class TNode<T> {

    protected T element;
    protected TNode<T> left;
    protected TNode<T> right;

    public TNode() {
    }

    public TNode(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        String leftVal = (left == null ? "Null" : left.element.toString());
        String rightVal = (right == null ? "Null" : right.element.toString());
        return "TNode{" +  element + ", left= " + leftVal + ", right= " + rightVal + '}';
    } 
}
