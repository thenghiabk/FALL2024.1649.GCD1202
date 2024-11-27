package L03_Recursion;

public class RecursiveDrawing {
    public static void main ( String[] args ) {
        printFigures( 5 );
    }

    private static void printFigures(int n){
        if ( n == 0 ){ // base case
            return;
        }
        printLineOfChars( '*', n ); // pre-action
        printFigures( n-1 ); // recursive call
        printLineOfChars( '#', n ); // post-action
    }

    private static void printLineOfChars(char ch, int n) {
        for ( int i = 0; i < n; i++ ) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
