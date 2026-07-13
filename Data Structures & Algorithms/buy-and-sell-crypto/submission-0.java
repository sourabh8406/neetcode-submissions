class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 0; i < n - 1; i++) {

            int max = prices[i + 1];

            for (int j = i + 1; j < n; j++) {
                if (prices[j] > max) {
                    max = prices[j];
                }
            }

            int profit = max - prices[i];

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}