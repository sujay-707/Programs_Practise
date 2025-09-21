public class MaxProdSubArrPreSuff {
    public static void main(String[] args) {
        // int arr[] = { 1, 3, 0, 5, 2, 4, 0, 6, 3 };
        int arr[] = { -2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4 };

        int pre = 1;
        int suf = 1;

        int n = arr.length;

        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;

            if (suf == 0)
                suf = 1;

            pre = pre * arr[i];
            suf = suf * arr[n - i - 1];

            ans = Math.max(ans, Math.max(pre, suf));

        }

        System.out.println("Max Prod of sub arr = " + ans);
    }

}
