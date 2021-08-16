
package ca2.basis2;

import java.util.ArrayList;

public class ArrayListStack<T> implements Stack<T>{

    private int top; //keeps track of the element at the top of the stack
    private ArrayList<T> items;

    public ArrayListStack() {
        this.top = -1;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void push(T element) {
        items.add(++top, element);
        //System.out.println("top now is at index: " + top);
    }

    @Override
    public T pop() {
        if(top == -1)
            throw new IndexOutOfBoundsException();
        else{
            T element = items.get(top);
            top--;
           // System.out.println("top is: " + top);
            return element;
        }
    }
    
    @Override
    public String toString() {
        String str = "";
        int i = top;
        while (i >= 0) {
            str += "element is: " + items.get(i) + "\n";
            i--;
        }
        return str;
    }
    // reverse a given String;
    public void ReverseString(String s){
        
        String reverse ="";
        for(int i = s.length() - 1; i >= 0; i--)
        {
            reverse = reverse + s.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);
        
    
    }

   
    public String duplicateVowels(String str) {
      
	{ 
String dupliocate = str;
for(int i = 0; i < str.length(); i++)
{
    if((str.charAt(i) == 'a') || 
    (str.charAt(i) == 'e')  ||
    (str.charAt(i) == 'i') || 
    (str.charAt(i) == 'o') ||
    (str.charAt(i) == 'u')) 
    {
        dupliocate = dupliocate.substring(0, i + 1) + Character.toString(dupliocate.charAt(i)) 
        + dupliocate.substring(i + 1, dupliocate.length());
        i++;
    }
}          
return dupliocate;
	
    }

     public int Count(T elem) {
        return CountEqualTo(elem, root);
    }

    private int Count(T elem, TNode<T> current) {
        int total =0;
        if (current == null) {
            return 0;
        }
        //if elem less than current, go left
        if (current.element.compareTo(elem) == 1) {
            return Count(elem, current.left);
        } //if elem bigger than current, go right
        else {
            //elem equal to 
            if (current.element.compareTo(elem) == 0) {
                return 1 + Count(elem, current.right);
            } //otherwise, go right
            else {
                return Count(elem, current.right);
            }
        }
    }
    
}
