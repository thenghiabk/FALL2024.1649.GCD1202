package L06_Searching;

public class BinarySearch {
    public static int search(int[] array, int target){
        // implement binary search
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int middle = (left + right) / 2;

            if ( array[middle] == target) {
                return middle;
            }

            if ( array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public static int searchRecursive(int[] array, int target){
        return searchRecursive( array, target, 0, array.length - 1 );
    }

    private static int searchRecursive(int[] array, int target, int left, int right){

        // base case
        if (left > right) {
            return -1;
        }

        // implement binary search
        int middle = (left + right) / 2;

        if (array[middle] == target){
            return middle;
        }

        if ( array[middle] < target) {
            return searchRecursive(array, target, middle + 1, right);
        } else {
            return searchRecursive(array, target, left, middle - 1);
        }

    }
}

class BinarySearchRunner {
    public static void main ( String[] args ) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int foundIndex = BinarySearch.search(numbers, 9);
        int foundIndex = BinarySearch.searchRecursive(numbers, 9);
        System.out.println( "Found at: " +  foundIndex);
    }
}