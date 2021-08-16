package SortingSearching;

import java.util.ArrayList;
import java.util.List;

public class SortingSearching {

    public static void bubbleSort(int[] a) {
        int temp; //this will be used when swapping 
        for (int j = 0; j < a.length-1; j++) 
            for(int i=0; i<a.length-1;i++)
                if(a[i]> a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }                
    }
    
    public static <T extends Comparable<T>> void bubbleSortGenetics(List<T> list){
        T temp;
        for (int j = 0; j < list.size()-1; j++) {
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i).compareTo(list.get(i+1)) == 1){
                    System.out.println("Comparing " + list.get(i) + " with " + list.get(i+1));
                    temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                }             
            }  
        }
    } 
    
    public static boolean LinearSearch(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value)
                return true;
        }
        return false;
    }
    
    public static boolean LinearSearchUsingSortedArray(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value)
                return true;
            else if(arr[i]> value)
                return false;
        }
        return false;
    }
    
    public static <T extends Comparable<T>> boolean LinearSearchGenerics(List<T> list, T Key){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(Key) == 0)
                return true;
            else if (list.get(i).compareTo(Key) == 1)
                return false;
        }
        return false;
    }
    
    public static boolean BinarySearch(int[] arr, int value){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int m = (int)Math.floor((left+right)/2);
            System.out.println("m = " + arr[m]);
            if(arr[m] == value)
                return true;
            else if(arr[m]<value){
                left = m+1;
                System.out.println("left = " + arr[left]);
                System.out.println("right = " + arr[right]);
            }else{
                right = m-1;
                System.out.println("left = " + arr[left]);
                System.out.println("right = " + arr[right]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> str = new ArrayList<>();
        str.add(12);
        str.add(6);
        str.add(17);
        str.add(5);
        str.add(1);
        bubbleSortGenetics(str);
        
        int[] arr = {15,22,33,100,250,280,310,480};
        System.out.println(BinarySearch(arr, 310));
//        System.out.println("\n");
//        for (int s : str) {
//            System.out.print(s + " ");
            
//        }
    }
}
