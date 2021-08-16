/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Daveg
 */
public class BubbleSort<T extends Comparable <T>> {
    

    public static void bubbleSort(int[] a){
        
        int temp; // this will be used when swapped
        
        for(int j=0; j< a.length-1; j++){
            System.out.println("Outer Loop");
        for(int i=0; i< a.length-j; i++) 
            if(a[i] > a[i+1]){
                System.out.println("Inner loop swapping " + a[i] + " with " + a[i+1]);
                temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        }
        
    public static void main(String[] args) {
            
            int [] b = {1,14,21,3,4,2};
            bubbleSort (b);
            System.out.println(Arrays.toString(b));
    }
        
    
}
        
      
    
    

