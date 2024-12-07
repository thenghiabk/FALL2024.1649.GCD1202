package L05_Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] array){

        // base case
        if (array.length < 2) {
            return;
        }

        // divide the array into half
        int middle = array.length / 2;
        int[] left = new int[middle];
        for ( int i = 0; i < middle; i++ ) {
            left[i] = array[i];
        }

        int[] right = new int[ array.length - middle];
        for ( int i = middle; i < array.length; i++ ) {
            right[i - middle] = array[i];
        }

        sort(left);
        sort(right);

        // conquer/merge
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            if (left[i] <= right [j]){
                array[k] = left[i];
                k++;
                i++;
            } else {
                array[k] = right[j];
                k++;
                j++;
            }
        }

        // copy the remaining elements to the end of the array
        while ( i < left.length){ // left has more elements
            array[k] = left[i];
            k++;
            i++;
        }

        while ( j < right.length) { // right has more elements
            array[k] = right[j];
            k++;
            j++;
        }
    }
}

class MergeSortRunner{
    public static void main ( String[] args ) {
        int[] numbers = {6, 10, 7, 5, 2, 4, 9, 8, 3};
        MergeSort.sort(numbers);

        System.out.println( Arrays.toString(numbers)); // [2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}