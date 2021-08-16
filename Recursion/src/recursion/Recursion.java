
package recursion;


public class Recursion {
    public static void main(String[] args) {
        //for(int i=0; i<10; i++)
         //   System.out.println("fibRecursive " + fibRecursive(i));
        // the power of
        System.out.println("5 power 4 is " + power(5,4));
        // count x
        System.out.println(countX("davex"));
        // check palindome
        System.out.println(checkPalindrome("abcba"));
        System.out.println(checkPalindrome("XYyx"));
	System.out.println(checkPalindrome("871232178"));
	System.out.println(checkPalindrome("CCCCC"));
        // count Hi
        System.out.println("How many times hi appears " + countHi("hidavehi"));
        // the sum of
        System.out.println("The sum of " + sumDigits(148));
        
        // chenge x to y
        System.out.println("Change all x to y " + changeXY("xxxdavexxx"));
        
        // no x
        System.out.println("Remove all x's " + noX("xxxdave no xxx"));
        
         // move all x's to the end of the string
        System.out.println("Move all x's to the end " + endX("xxxdave"));
        
        // clean all the matching pairs 
        System.out.println("Clean all matching pairs " + stringClean("yyyzza"));
        
        int[] myArray = new int[]{ 1, 0,2,10, 100, 3,4,5,6,7,8,9,10 }; 
        System.out.println("Array " + array220(myArray,0));
        
        String Str = new String("david greene");
        System.out.println(Str.substring(4,8)); 
    }
    
    public static int fib (int n){
        if(n == 0)
            return 0;
        int a = 0, b = 1;
        for(int i=2; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
    public static int fibRecursive(int n){
        if(n <= 1)
            return n;
        return fibRecursive(n-1) + fibRecursive(n-2);
    }
    
    public static int factorial(int n){
        int fact = 1; 
        for(int i = 1; i<=n; i++)
            fact *= i;
        return fact;
    }
    
    public static int factorialRec(int n){
        if(n<=1)
            return 1;
        return n*factorialRec(n-1);
    }
    
    public static int power(int n, int e){
        if(e == 0)
            return 1;
        if(e == 1)
            return n;
        return n*power(n,e-1);
    }
    // count x
    public static int countX(String str){
	if(str.length() == 0)
		return 0;
	if(str.charAt(0) == 'x')
		return 1 + countX(str.substring(1));
	return countX(str.substring(1));
    }
    
   
    
    // check Palindrome
    public static boolean checkPalindrome(String str) {
		if (str == null)
			return false;
		if (str.length() <= 1) {
			return true;
		}
		String first = str.substring(0, 1);
		String last = str.substring(str.length() - 1);
		if (!first.equals(last))
			return false;
		else
			return checkPalindrome(str.substring(1, str.length() - 1));
	}


    // Given a string, compute recursively (no loops) the number of times lowercase “hi”
    //appears in the string.
    public static int countHi(String str){
	if(str.length() < 2) // base
		return 0;
	if(str.charAt(0) == 'h' && str.charAt(1) == 'i')
		return 1 + countHi(str.substring(2));
	return countHi(str.substring(1));  
       }
    // Given a non-negative int n, return the sum of its digits recursively (no loops). Note
    //that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
    //removes the rightmost digit (126 / 10 is 12).
    public static int sumDigits(int n)
{
	if(n < 10)
		return n;
	return sumDigits(n/10) + n%10;
}

    //Given a string, compute recursively (no loops) a new string where all the lowercase ’x’
    //chars have been changed to ’y’ chars.

    public static String changeXY(String str){
	char ch;
	if(str.length() == 0)
		return str;
	ch = str.charAt(0);
	if(ch == 'x')
		return 'y' + changeXY(str.substring(1));
	return ch + changeXY(str.substring(1));
}
    // Given a string, compute recursively a new string where all the ’x’ chars have been
    // removed.
    public static String noX(String str){
	char ch;
  if(str.length() == 0)
  	return str;
  ch = str.charAt(0);
  if(ch == 'x')
  	return noX(str.substring(1));
  return ch + noX(str.substring(1));
}
    
    // Given a string, compute recursively a new string where all the lowercase ’x’ chars have
    // been moved to the end of the string.
    public static String endX(String str){
	if(str.length() == 0)
		return str;
	if(str.charAt(0) == 'x')
		return endX(str.substring(1)) + 'x';
	return str.charAt(0) + endX(str.substring(1));
}
    
    
    // Given a string, return recursively a “cleaned” string where adjacent chars that are the
    // same have been reduced to a single char. So “yyzzza” yields “yza”.
    public static String stringClean(String str){
	if(str.length() < 2)
		return str;
	if(str.charAt(0) == str.charAt(1))
		return stringClean(str.substring(1));
	return str.charAt(0) + stringClean(str.substring(1));
}
    
    // Given an array of ints, compute recursively if the array contains somewhere a value
    // followed in the array by that value times 10. We’ll use the convention of considering
    // only the part of the array that begins at the given index. In this way, a recursive call
    // can pass index+1 to move down the array. The initial call will pass in index as 0.
    public static boolean array220(int[] nums, int index)
{
	if(index >= nums.length - 1)
		return false;
	if(nums[index] * 10 == nums[index+1])
		return true;
	return array220(nums, index + 1);
}
} // close class