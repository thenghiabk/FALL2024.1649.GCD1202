package L06_Searching;

public class LinearSearch {
    public static int search(int[] array, int target){
        // implement linear search

        // Option 1: for loop
        /*
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] == target){
                return i;
            }
        }
        */

        // Option 2: while loop
        int i = 0; // index variable
        while ( i < array.length ) {
            if (array[i] == target){
                return i;
            }
            i++; // increment index variable
        }

        return -1;
    }
}

class LinearSearchRunner{
    public static void main ( String[] args ) {
        int[] numbers = {6, 10, 7, 5, 2, 4, 9, 8, 3};
        int foundIndex = LinearSearch.search(numbers, 19);
        System.out.println( "Found at: " +  foundIndex);
    }
}
