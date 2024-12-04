package L05_Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] array){
        boolean isSorted;
        for ( int i = 0; i < array.length; i++ ) {

            isSorted = true; // assume the array is sorted

            for ( int j = 1; j < array.length; j++ ) {
                if (array[ j ] < array[ j - 1]){
                    // swap elements
                    int temp = array[ j ];
                    array[ j ] = array[ j - 1 ];
                    array[ j - 1 ] = temp;
                    isSorted = false;
                }
            }

            if ( isSorted ){ // if the array is already sorted
                return; // we can stop
            }
        }
    }
}

class BubbleSortRunner {
    public static void main ( String[] args ) {
        int[] numbers = { 6, 10, 7, 5, 2, 4, 9, 8, 3 };
        BubbleSort.sort( numbers );

        System.out.println( Arrays.toString( numbers ) ); // [2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
