/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Arrays;

/**
 *
 * @author Daveg
 */
public class Sorting {
    
    public static void main (String args[]){
        
        int nums [] = {4,8,10,5,2,3,7,1};
        System.out.println("unsorted " + Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println("sorted " + Arrays.toString(nums));
    }
    
    public static void bubbleSort(int [] a){
        int temp;
        for (int j=0; j<a.length-1; j++){
            for(int i=0; i<a.length-1; i++){
                if(a[i]>a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
            
        }
    }
    
}
