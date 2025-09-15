public class CheckArrSorted {

    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 90, 10, 20, 30, 40 };

        System.out.println("Array Elements ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(isSorted(arr));

        if (isSorted(arr)) {
            System.out.println("Array Elements are Sorted");
        } else {
            System.out.println("Array Elements are Not Sorted");
        }

    }

}
