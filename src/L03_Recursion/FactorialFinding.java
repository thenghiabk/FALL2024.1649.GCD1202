package L03_Recursion;


public class FactorialFinding {
    public static void main ( String[] args ) {
        int result = factorial( 5 );
        System.out.println(result);
    }

    // factorial solution: n! = n * (n-1)!
    private static int factorial ( int n ) {
        if ( n == 1 || n == 0 ) { // base case
            return 1;
        }
        return n * factorial( n - 1 ); // recursive call
    }
}

