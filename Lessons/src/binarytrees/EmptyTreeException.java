
package binarytrees;

class EmptyTreeException extends RuntimeException {

    public EmptyTreeException() {
        super("Tried to find/extract element from an empty tree");
    }
    
}
