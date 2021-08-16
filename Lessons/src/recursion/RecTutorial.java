
package recursion;


public class RecTutorial {
    public static void main(String[] args) {
        System.out.println(countHI("danhidolchi"));
        System.out.println(removeX("haxpxpxy"));
        int arr[] = {1,2,2,29,4,40};
        System.out.println(Check10Multiply(arr, 0));
        System.out.println(appendX("Rxexonax"));
        System.out.println(SumofDigits(1345));
        System.out.println(XtoY("xhowxtoxx"));
        System.out.println(ReduceString("xxzyyyhehhnmmmmn"));
    }
    
    public static int countHI (String s){
        if(s.length() < 2)
            return 0;
        //if s starts with "hi"
        else if(s.substring(0, 2).equals("hi")){
            return 1 + countHI(s.substring(2));
        }
        else{
            //if the s does not start with h, discard first character 
            return countHI(s.substring(1));
        }
    }
    
    public static String removeX(String s){
        //if s is empty
        if(s.length() == 0)
            return "";
        //if x is the first character in x, remove it and pass the remaing string to removeX
        else if(s.charAt(0) == 'x')
             return removeX(s.substring(1, s.length())); 
        else{ 
            //if not, keep the first character and pass the remaining string to removeX
            return s.charAt(0) + removeX(s.substring(1));
        }
    }
    public static boolean Check10Multiply(int arr[], int index){
        //if array is empty
        if (arr.length == 0)
            return false;
        else{
            //traverse the list and check
            if(arr[index+1] == 10*arr[index])
                return true;
            else{
                //case where the length is odd
                if(index+1 > arr.length)
                    return false;
                return Check10Multiply(arr, index+1);
            }
        }
    }
    
    public static String appendX(String s){
        if(s.length() <= 1)
            return s;
        //if x is the first character, append it 
        if(s.charAt(0) == 'x')
            return appendX(s.substring(1)) + s.charAt(0);
        //otherwise, keep the first character and pass the remaining string to appendX
        else    
            return s.charAt(0) + appendX(s.substring(1));
    }
    
    public static int SumofDigits(int n){
        if(n<10)
            return n;
        //get the rightmost number and pass the remaining digits to SumofDigits
        return (n%10) + SumofDigits(n/10);
    }
    
    public static String XtoY (String s){
        if(s.length() < 1)
            return s;
        //if x is the first character in s, change to y and pass the remaining string to XtoY
        if(s.charAt(0) == 'x')
            return 'y' + XtoY(s.substring(1));
        //otherwise, keep the first character and pass the remaining string to XtoY
        else 
            return s.charAt(0) + XtoY(s.substring(1));
    }
    
    public static String ReduceString(String s){
        if(s.length() <= 1)
            return s;
        //if the first two characters are identical, remove the first and pass the remaining string to ReduceString
        if(s.charAt(0) == s.charAt(1))
            return ReduceString(s.substring(1));
        //otherwise, keep the first character and pass the remaining string to ReduceString 
        else
            return s.charAt(0) + ReduceString(s.substring(1));
    }
    
}
