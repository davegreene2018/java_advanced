/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;


import static Recursion.Recursion.print;
import java.util.Arrays;
/**
 *
 * @author Daveg
 */
public class BubbleSort {
    
    public static void main (String args[]){
        int[] nums = {1,6,3,9,2,7,4,8,10};
        
        System.out.println("Unsorted " + Arrays.toString(nums));
        BubbleSort(nums);
        System.out.println("Sorted " + Arrays.toString(nums));
        System.out.println(LinearSearch(nums, 11));
        reverse2("davegreene");
        
    }
    
    
    public static void BubbleSort(int[] a){
        int temp;
        for(int j=0; j<a.length-1;j++)
            for(int i=0; i<a.length-1;i++)
                if(a[i]>a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
        
    }
    
    public static boolean LinearSearch(int[] nums, int value){
        for(int i=0; i< nums.length-1;i++){
            if(nums[i]== value)
                return true;
            
        }
        return false;
    }
    
    public static void reverse(String s){
        reverse(s, s.length()-1);
    }
    public static void reverse(String s, int index){
        if(index<0)
            return;
        System.out.println(s.charAt(index));
        reverse(s, index-1);
                    
        
    }
    
    public static void reverse2(String s){
        reverse(s, s.length()-1);
    }
    
    public static void reverse2(String s, int index){
        if(index<0)
            return;
        System.out.println(s.charAt(index));
        reverse2(s, index-1);
    }
    
}
