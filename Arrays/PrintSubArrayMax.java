public class PrintSubArrayMax {

    public static void PriSubArrz(int arr[]) {
        int n = arr.length;

        int currSum;
        int maxSum = Integer.MIN_VALUE;

        int tsa = 0;

        for (int i = 0; i < n; i++) {
            int s = i;
            for (int j = i; j < n; j++) {
                int e = j;
                currSum = 0;
                for (int k = s; k <= e; k++) {
                    System.out.print(arr[k] + " ");
                    currSum = currSum + arr[k];
                }
                System.out.println("= " + currSum);

               maxSum = Math.max(maxSum , currSum);
                tsa++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array Found - " + tsa);
        System.out.println("Maximum SubArray Sum - " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6 };
        PriSubArrz(arr);

    }

}
