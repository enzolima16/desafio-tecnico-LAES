public class BTBSS {
    public int maxProfitCalculator(int[] prices) {
        int bestBuy = prices[0];
        int bestSell = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            int potentialProfit = currentPrice - bestBuy;

            if (potentialProfit > bestSell) {
                bestSell = potentialProfit;
            }

            if (currentPrice < bestBuy) {
                bestBuy = currentPrice;
            }
        }
        return bestSell;
    }

    public static void main(String[] args) {
        int[] p = { 7, 1, 5, 3, 6, 4 };
        BTBSS m = new BTBSS();
        System.out.println(m.maxProfitCalculator(p));
    }
}