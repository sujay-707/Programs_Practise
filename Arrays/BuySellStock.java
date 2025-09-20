public class BuySellStock {

    public static int BuySellStk(int arr[]) {
        int minVal = arr[0];
        int maxProfit = 0;

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int cost = arr[i] - minVal;
            maxProfit = Math.max(maxProfit, cost);
            minVal = Math.min(minVal, arr[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };

       int profitRes = BuySellStk(arr);
        if (profitRes == 0) {
            System.out.println("No profit possible.");
        } else {
            System.out.println("Maximum Profit = " + profitRes);
        }
    }

    }


