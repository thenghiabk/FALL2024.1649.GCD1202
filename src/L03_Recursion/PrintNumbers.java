package L03_Recursion;

public class PrintNumbers {
    public static void main ( String[] args ) {
        printNumbers( 1 );
    }

    private static void printNumbers ( int n ) {

        if (n != 5){ // base condition / base case
            printNumbers( n+1 ); // recursive call
        }

        System.out.print(n + " ");
    }
}
