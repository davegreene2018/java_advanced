/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



/**
 *
 * @author Daveg
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        int size = nums.size();
        
        nums.add(7);
        nums.add(6);
        nums.add(3);
        nums.add(4);
        nums.add(2);
        
      
        System.out.println("The third smallest number is " + thirdSmallest(nums));
      
    }
    
    public static int thirdSmallest(Set<Integer> candidates){
        int size = candidates.size();
        
        Integer[] temp = candidates.toArray(new Integer[]{});
        Arrays.sort(temp);
        
        int result = temp[temp.length -3];
        return result;
    }
    
            
        
}
