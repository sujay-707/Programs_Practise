public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;

        int pos = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[pos] = nums[i];
                pos++;

            }
        }
        return pos;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 2, 3 };
        int val = 3;

        System.out.println(removeElement(nums, val));

    }

}