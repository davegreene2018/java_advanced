package stacks;

import java.util.Arrays;

public class ArrayStack<T> implements Stack<T> {

   private int maxsize;
   private int top;
   private T[] items;
   
   public ArrayStack(int size){
       this.maxsize = size;
       this.top = -1;
       this.items = (T[]) new Object [maxsize];
   }

    @Override
    public void push(T element) {
        if(top == maxsize -1){
            reallocate ();
        }
        else {
            items[++top] = element;
        }
    }

    @Override
    public T pop() {
       if(top == -1){
           throw new IndexOutOfBoundsException();
       }
       else {
           T elem = items[top--];
           return elem;
       }
    }
   
   public void reallocate (){
       items = Arrays.copyOf(items, maxsize * 2);
   }

    @Override
    public String toString() {
        String str = "";
        int i = top;
        while (i>=0){
            str += "Element is: " + items[i] + "\n";
            i--;
        }
        return str;
    }
   
 

   

}
