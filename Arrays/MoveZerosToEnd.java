import java.util.*;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {0,1,0,3,12};
        int n = nums.length;
         int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }


        System.out.println(pos);

        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }


        for(int i=0 ;i<n;i++){
        System.out.print(nums[i] + " ");
        }
    }
}
