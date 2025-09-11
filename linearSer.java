public class linearSer {

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int lin(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 4, 8, 6 };
        int target = 3;

        PrintArr(arr);

        int idx = lin(arr, target);

        if (idx != -1) {
            System.out.println(target + " found " + " at index " + idx);
        } else {
            System.out.println(target + " not found int the array" );
        }
    }
}
