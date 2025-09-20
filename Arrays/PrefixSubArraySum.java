public class PrefixSubArraySum {

    public static void prefixSum(int arr[]) {
        int n = arr.length;
        int currSum ;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        System.out.print("Max Sub Array Sum - ");
        prefixSum(arr);

    }

}
