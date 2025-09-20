import java.util.Arrays;

public class KthLargestInArr {
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,1,3,5,7,25 };

        int n = arr.length;

        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr); // ascending order

        int k = 3; 

        if (k <= n) {
            int kthLargest = arr[n - k];
            System.out.println(k + "th Largest element in array = " + kthLargest);
        } else {
            System.out.println("Invalid value for k!");
        }
    }
}
