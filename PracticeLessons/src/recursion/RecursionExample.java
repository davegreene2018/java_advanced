
package recursion;


public class RecursionExample {
    public static void main(String[] args) {
//        for(int i=0; i<10; i++)
//            System.out.println(fibRecursive(i));
        
        System.out.println("5 power 4 is " + power(5,4));
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
}
