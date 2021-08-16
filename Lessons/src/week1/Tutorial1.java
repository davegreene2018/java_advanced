
package week1;
import java.util.*;

/**
 *
 * @author Mohammed 
 */
public class Tutorial1 {

    public static void print(List<String> arr){
        for (String current : arr) {
            System.out.println(current);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("bye");
        //Tutorial1.print(list);
        for (int i = 0; i < list.size(); i++) {
        //    System.out.println(list.get(i));
        }
        list.add("for now");
        Tutorial1.print(list);
        System.out.println("");
        list.remove(0);
        Tutorial1.print(list);
        System.out.println("");
        list.add(1,"beautiful");
        Tutorial1.print(list);
        System.out.println("");
        list.remove("World");
        Tutorial1.print(list);
        System.out.println("");
        list.set(1, "Europe");
        Tutorial1.print(list);
        System.out.println("");
        boolean isThere = list.contains("World");
        System.out.println(isThere);
        
        //-----------------------------------------------
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hi");
        list1.add("beautiful");
        list1.add("Ireland");
        list1.add("!");
        Tutorial1.print(list1);
        list.addAll(list1);
        Tutorial1.print(list);
        System.out.println("");
        list1.clear();
        Tutorial1.print(list1);
        System.out.println("");
        
        //-----------------------------------------------
        ArrayList<String> colours = new ArrayList<>(3);
        colours.add("Green");
        colours.add("White");
        colours.add("Orange");
        Tutorial1.print(colours);
        System.out.println("");
        colours.ensureCapacity(6);
        colours.add("Red");
        colours.add("Blue");
        colours.add("Yellow");
        Tutorial1.print(colours);
        System.out.println("");
        Tutorial1.MySwap("Green", "Red", colours);
        Tutorial1.print(colours);
        System.out.println("");
        Tutorial1.MyReverse(colours);
        Tutorial1.print(colours);
        System.out.println("");
        
        //-----------------------------------------------
        ArrayList<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrInt.add(i);
        }
        Tutorial1.printInt(Tutorial1.removeTwoMultiples(arrInt));
        
        //-----------------------------------------------
        ArrayList<String> aList = new ArrayList<>();
        aList.add("this");
        aList.add("is");
        aList.add("lots");
        aList.add("fun");
        aList.add("for");
        aList.add("Java");
        aList.add("programmers");
        Tutorial1.print(aList);
        System.out.println("");
        Tutorial1.print(markLength4(aList));
    }  
    //-----------------------------------------------------
   
    public static void MySwap(String s1, String s2, ArrayList<String> arr){
        if(!arr.contains(s1))
            System.out.println(s1 + "is not in the list");
        else if(!arr.contains(s1))
            System.out.println(s2 + "is not in the list");
        else
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 1; j < arr.size(); j++) {
                    if(arr.get(i).equals(s1) && arr.get(j).equals(s2)){
                        arr.set(j, s1);
                        arr.set(i, s2);
                    }
                }
                
            }
    }
    
    public static void MyReverse(ArrayList<String> arr){
        ArrayList<String> temp = new ArrayList<>();
        temp.addAll(arr);
        int j = 0;
        for (int i = temp.size(); i > 0; i--) {
            arr.set(j,temp.get(i-1));
            j++;
        }
    }
    
    public static ArrayList<Integer> removeTwoMultiples(ArrayList<Integer> arr){
        for(int i=0; i < arr.size(); i++){
            if(arr.get(i)%2 == 0)
                arr.remove(i);
        }
        return arr;
    }
    
     public static void printInt(List<Integer> arr){
        for (int current : arr) {
            System.out.println(current);
        }
    }
     
    public static ArrayList<String> markLength4(ArrayList<String> arr){
        ArrayList<String> temp = new ArrayList<>();
        temp.addAll(arr);
        for (int i = 0; i < temp.size(); i++) {
            if(temp.get(i).length()== 4){
                arr.add(arr.indexOf(temp.get(i)), "****");
            }
        }
        return arr;
    }  
}
