import java.util.*;

public class LongestConsNosArr {

    public static int longestCons(int arr[]) {
        int n = arr.length;
        if (n == 0) return 0;

        Arrays.sort(arr);

        int cnt = 1;            
        int longest = 1;
        int lastsmall = arr[0]; 

        for (int i = 1; i < n; i++) {
            if (arr[i] == lastsmall) {
                continue;
            } else if (arr[i] - 1 == lastsmall) {
                
                cnt++;
            } else {
                cnt = 1;
            }

            lastsmall = arr[i];
            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 9, 10, 20};
        System.out.println(longestCons(arr1)); 

        int arr2[] = {1, 1, 1, 2, 2, 2, 3, 3, 4, 100, 100, 101, 101, 102};
        System.out.println(longestCons(arr2)); 

        int arr3[] = {100, 4, 200, 1, 3, 2};
        System.out.println(longestCons(arr3)); 
    }
}
