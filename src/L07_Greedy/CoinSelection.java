package L07_Greedy;

import java.util.Arrays;

public class CoinSelection {
    public static int getMinCoins(int[] coins, int target){
        // implement coin selection
        Arrays.sort(coins); // [1, 2, 5, 10, 20, 50]

        int minCoins = 0;
        int index = coins.length - 1;

        while(target > 0){
            int currentCoin = coins[index];

            if (currentCoin <= target){
                int maxAmount = target / currentCoin;
                target = target - currentCoin * maxAmount;
                minCoins = minCoins + maxAmount;
                System.out.println("Taking " + maxAmount + " of " + currentCoin);
            } else {
                System.out.println("Skipping " + currentCoin + " due to current target = " + target);
                index = index - 1;
            }
        }
        return minCoins;
    }
}

class CoinSelectionRunner{
    public static void main ( String[] args ) {
        int[] coins = {50, 20, 10, 5, 2, 1};

        int target = 923;

        int minCoins = CoinSelection.getMinCoins(coins, target);
        System.out.println("Min selected coins: " + minCoins);

    }
}
