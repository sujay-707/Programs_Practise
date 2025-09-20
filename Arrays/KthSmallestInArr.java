
import java.util.*;

public class KthSmallestInArr {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 20, 40, 60, 50 };

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr);

        System.out.println("Arrays after Sorting ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int k = 2;

        int klarVal;
        int ksmlVal;

        if (k <= n) {
            klarVal = arr[n - k];
            ksmlVal = arr[k - 1];

            System.out.println(k + "th smallest val in Array = " + ksmlVal);
            System.out.println(k + " th largest val in Array = " + klarVal);
        } else {
            System.out.println("Ivalid k value Try Again ");
        }

    }
}
