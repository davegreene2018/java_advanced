package week1;

/**
 *
 * @author irina
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Week1 week = new Week1();
        System.out.println(week.fib(8));
    }
    public int fib (int n){
        int a =1, b = 1;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
        return b;
    }
    
}
