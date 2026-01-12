package Array;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = { 1, 5, 3, 6, 4 };
        int maxProfit = 0;
        int minPrice= prices[0];

        for(int i=0;i<prices.length;i++){
            maxProfit= Math.max(maxProfit, prices[i]-minPrice);
            minPrice=Math.min(minPrice, prices[i]);
        }
        System.out.println(maxProfit);

    }
}


    //     for (int i = 1; i < prices.length; i++) {
    //         if (prices[i] < prices[minIndex]) {
    //             minIndex = i;
    //         }
    //     }
    //     for(int i=minIndex;i<prices.length;i++){
    //         for (int j = minIndex+1; j < prices.length; j++) {
    //             if(prices[i]+prices[j] > maxProfit){
    //                 maxProfit=prices[i]+prices[j];
    //             }
    //         }
    //     }
    //     System.out.println(maxProfit);
    // }
