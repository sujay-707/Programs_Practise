

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 1, 1, 0, 1, 1 };

        int n = arr.length;

        int maxi = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                maxi = Math.max(maxi, cnt);
            } else {
                cnt = 0;

            }
        }
        System.out.println(maxi);
    }

}
