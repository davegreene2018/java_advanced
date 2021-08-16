package binarytrees;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(12);
        tree.insert(02);
        tree.insert(04);
        tree.insert(03);
        tree.insert(15);
        tree.insert(34);
        
      
       
        System.out.println("Post-order: ");
        tree.postOrder();        
    }
}
