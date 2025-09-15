public class MoveZerosAtEnd {

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 4, 0, 0, 5, 0 };
        // int arr[] = { 5, 4, 3, 2, 1 };

        System.out.println("Array Elements with Zeros");
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int j = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            System.out.println("NO Zeros Found in the Array ");
            return;

        }

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }

        }

        System.out.println();
        System.out.println("Array element zeros moved to end");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}