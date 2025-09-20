public class CheckArrContainsDupli {

    public static void printArrVal(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean DupContainCheck(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5, 6 };

        printArrVal(arr);

        System.out.println("Array Conatins Duplicates = " + DupContainCheck(arr));

    }

}
