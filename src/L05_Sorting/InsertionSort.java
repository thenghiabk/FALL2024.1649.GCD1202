package L05_Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array){
        // TODO implement insertion sort
    }
}

class InsertionSortRunner{
    public static void main ( String[] args ) {
        int[] numbers = {6, 10, 7, 5, 2, 4, 9, 8, 3};
        InsertionSort.sort(numbers);

        System.out.println( Arrays.toString( numbers ) );
    }
}
