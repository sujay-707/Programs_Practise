public class PrintSubArray {

    public static void PriSubArrz(int arr[]) {
        int n = arr.length;

        int ts = 0;

        for (int i = 0; i < n; i++) {
            int s = i;
            for (int j = i; j < n; j++) {
                int e = j;
                int sum = 0;
                for (int k = s; k <= e; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                System.out.println("= " + sum);
                ts++;

                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array Found - " + ts);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        PriSubArrz(arr);

    }

}
