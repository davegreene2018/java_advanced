
package stacks;

public class ArrayStackExample {
    public static void main(String[] args) {
        Stack<String> stack = new ArrayStack<>(2);
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.toString());
        stack.push("Test");
        //String elem = stack.pop();
        System.out.println(stack.toString());
        //System.out.println(stack.toString());
        
        ArrayStack myStack = new ArrayStack<>(2);
        myStack.push("Dave");
        myStack.push("Greene");
        myStack.pop();
        System.out.println(myStack.toString());
    }
  
}
