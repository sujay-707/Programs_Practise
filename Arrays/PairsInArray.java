public class PairsInArray {
    public static void PrintPairs(int arr[]) {

        int tp = 0;
        int n = arr.length;

        System.out.println("Array Elements are - ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Pairs Formed - ");

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are - " + tp);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };

        PrintPairs(arr);
    }

}
