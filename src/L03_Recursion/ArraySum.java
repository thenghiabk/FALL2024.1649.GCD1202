package L03_Recursion;

public class ArraySum {
    public static void main ( String[] args ) {
        int[] numbs = {1, 2, 3, 4, 5, 6, 7};
        int result = sum( numbs, 0 );

        System.out.println(result); // 10
    }

    private static int sum (int[] numbs, int i  ){

        // base case
        if (i == numbs.length - 1){
            return numbs[i];
        }

        return numbs[i] + sum(numbs, i+1);
    }
}
