public class PrintEvenNumsAtBegining {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 3, 4, 9, 8, 10, 12 };

        int n = arr.length;
        int temp[] = new int[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                temp[idx] = arr[i];
                idx++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 != 0) {
                temp[idx] = arr[j];
                idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}
