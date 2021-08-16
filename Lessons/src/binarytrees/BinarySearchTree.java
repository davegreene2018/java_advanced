package binarytrees;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTreeInterface<T> {

    private TNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    @Override
    public void insert(T element) {
        //tree is empty
        if (isEmpty()) {
            root = new TNode<>(element);
        } //tree is not empty, find exact location to insert new element
        else {
            insertNode(element, root);
        }
    }

    private void insertNode(T elem, TNode<T> current) {
        if (current.element.compareTo(elem) == 1) {
            //if current has no left child
            if (current.left == null) {
                current.left = new TNode<>(elem);
            } //if current has a left child
            else {
                insertNode(elem, current.left);
            }
        } else {
            //if current has no right child
            if (current.right == null) {
                current.right = new TNode<>(elem);
            } //if current has a right child
            else {
                insertNode(elem, current.right);
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void inOrder() {
        inorder(root);
    }

    private void inorder(TNode<T> node) {
        //base case
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.element);
        inorder(node.right);
    }

    @Override
    public void preOrder() {
        preorder(root);
    }

    private void preorder(TNode<T> node) {
        //base case
        if (node == null) {
            return;
        }
        System.out.println(node.element);
        preorder(node.left);
        preorder(node.right);
    }

    @Override
    public void postOrder() {
        postorder(root);
    }

    private void postorder(TNode<T> node) {
        //base case
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.element);
    }

    @Override
    public void printLessThan(T elem) {
        printLessThan(elem, root);
    }

    private void printLessThan(T elem, TNode<T> node) {
        //base case
        if (node == null) {
            return;
        }
        //if elem is bigger than the root, print all elements
        //in the left sub-tree as well as the elements in the
        //right sub-tree which are less than elem
        if (node.element.compareTo(elem) == -1) {
            System.out.println(node.element);
            printLessThan(elem, node.left);
            printLessThan(elem, node.right);
        } //Othersiwe, go left till you find a value which is less than elem
        else {
            printLessThan(elem, node.left);
        }
    }

    @Override
    public int CountEqualTo(T elem) {
        return CountEqualTo(elem, root);
    }

    private int CountEqualTo(T elem, TNode<T> current) {
        if (current == null) {
            return 0;
        }
        //if elem less than current, go left
        if (current.element.compareTo(elem) == 1) {
            return CountEqualTo(elem, current.left);
        } //if elem bigger than current, go right
        else {
            //elem equal to 
            if (current.element.compareTo(elem) == 0) {
                return 1 + CountEqualTo(elem, current.right);
            } //otherwise, go right
            else {
                return CountEqualTo(elem, current.right);
            }
        }
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(TNode<T> current) {
        //base case 
        if (current == null) {
            return 0;
        } else {
            return 1 + size(current.left) + size(current.right);
        }
    }

    @Override
    public T findMin() {
        if (isEmpty()) {
            throw new EmptyTreeException();
        } else {
            return findMin(root);
        }
    }

    private T findMin(TNode<T> current) {
        //base case
        if (current.left == null) {
            return current.element;
        } else //keep going left. Minimum is always in the left sub-tree
        {
            return findMin(current.left);
        }
    }

    @Override
    public T findMax() {
        if (isEmpty()) {
            throw new EmptyTreeException();
        } else {
            return findMax(root);
        }
    }

    private T findMax(TNode<T> current) {
        //base case
        if (current.right == null) {
            return current.element;
        } else //keep going right, the maximum is always in the right sub-tree
        {
            return findMax(current.right);
        }
    }

    @Override
    public TNode<T> findNode(T elem) {
        return findNode(elem, root);
    }

    private TNode<T> findNode(T elem, TNode<T> current) {
        //base case 
        if (current == null) {
            return null;
        } //if elem is the current node, return current
        else if (current.element.compareTo(elem) == 0) {
            return current;
        } else if (current.element.compareTo(elem) == 1) //go left
        {
            return findNode(elem, current.left);
        } else //go right
        {
            return findNode(elem, current.right);
        }
    }

    @Override
    public TNode<T> findParent(T elem) {
        return findParent(elem, root);
    }

    private TNode<T> findParent(T elem, TNode<T> current) {
        //handle the case where elem is the root
        if (root.element.compareTo(elem) == 0) {
            return null;
        }
        if (current.element.compareTo(elem) == 1) {
            //go left
            if (current.left == null) {
                return null; //elem is not in the tree
            } else {
                if (current.left.element.compareTo(elem) == 0) {
                    return current; //current is the parent
                } else {
                    return findParent(elem, current.left);
                }
            }
        } else {
            //go right
            if (current.right == null) {
                return null; //elem is not in the tree;
            } else {
                if (current.right.element.compareTo(elem) == 0) {
                    return current;
                } else {
                    return findParent(elem, current.right);
                }
            }
        }
    }

    @Override
    public void remove(T elem) {
        remove(elem, root);
    }

    private void remove(T elem, TNode<T> current) {
        //elem is not in the tree
        if (findNode(elem) == null) {
            System.out.println(elem + "is not in the tree");
        //elem is in the tree, check whether it is a leaf or an internal node
        } else {
            //find the node containing the element to be removed as well as it parent
            TNode<T> toRemove = findNode(elem);
            TNode<T> parent = findParent(elem);
            //1. leaf node (node has no children) 
            if (toRemove.left == null && toRemove.right == null) {
                //if the node is the only one in the tree
                if (toRemove == root && size() == 1) {
                    root = null;
                }
                //check whether the node to be removed is on the left/ right and set the appropriate reference to null 
                //for the parent node
                if (toRemove.element.compareTo(parent.element) == 1) {
                    parent.right = null;
                } else {
                    parent.left = null;
                }
            } //2. internal node (including the case of the root node)
            else {
                //node has only the left child
                if (toRemove.left != null && toRemove.right == null) {
                    //if the root is to be removed, make the node at the left as root
                    if (toRemove == root) {
                        root = root.left;
                        //check whether the node to be removed is on the left/ right and set the appropriate reference to null 
                        //for the parent node    
                    } else if (toRemove.left.element.compareTo(parent.element) == -1) {
                        parent.left = toRemove.left;
                    } else {
                        parent.right = toRemove.left;
                    }
                }
                //node has only the right child
                if (toRemove.left == null && toRemove.right != null) {
                    //if the root is to be removed, make the node at the right as root
                    if (toRemove == root) {
                        root = root.right;
                        //check whether the node to be removed is on the left/ right and set the appropriate reference to null 
                        //for the parent node     
                    } else if (toRemove.right.element.compareTo(parent.element) == 1) {
                        parent.right = toRemove.right;
                    } else {
                        parent.left = toRemove.right;
                    }
                } //node has both children
                else {
                    //find maximum in the left sub-tree
                    TNode<T> node = findNode(findMax(toRemove.left));
                    TNode<T> pnode = findParent(findMax(toRemove.left));
                    //assign the left sub-tree of the maximum to its parent's right child 
                    
                    pnode.right = node.left;
                    //set the element of the node to be removed to the maximum
                    toRemove.element = node.element;
                }
                System.out.println(elem + " was removed from the tree");
            }
        }
    }
    
}
