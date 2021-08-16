
package week1;
import java.util.ArrayList;
/**
 *
 * @author irina
 */
public class ArrayListExemple {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dominic");
        list.add("John");
        list.add(1, "Marta"); 
        //list.set(1, "Joan");
//        for (String i : list) {
//            System.out.println(i);
//        }
//        System.out.println(list);  
//        int size = list.size();
//        
//        
//        System.out.println(list.get(1));
//        System.out.println(size);
//        list.remove("Marta");
//        list.remove(0);
//       
//        System.out.println(list);    
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Gabriel");
        list1.add("Nancy");
        
        ArrayList<String> bigList = new ArrayList<>();
        bigList.addAll(list);
        bigList.addAll(list1);
        for (String s : bigList) {
            System.out.println(s);
        }
        bigList.removeAll(list);
        for (String s : bigList) {
            System.out.println(s);
        }
    }
}
