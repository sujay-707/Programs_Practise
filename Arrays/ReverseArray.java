public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };

        int n = arr.length;
        System.out.println("Array Elements - ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int s = 0;
        int e = n - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        System.out.println();
        System.out.println("Array Elements Reversed - ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
