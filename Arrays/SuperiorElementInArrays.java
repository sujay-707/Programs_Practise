
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperiorElementInArrays {

    public static List<Integer> SuperiorElez(int arr[]) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();

        int maxi = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                ans.add(arr[i]);
                maxi = arr[i];
            }
        }

        Collections.reverse(ans);

        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        List<Integer> res = SuperiorElez(arr);

        System.out.println("Superior Leader in Arrays ");
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }

    }

}
