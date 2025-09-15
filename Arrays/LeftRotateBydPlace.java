
public class LeftRotateBydPlace {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40 };
        int d = 2;

        int n = arr.length;
        int temp[] = new int[n];

        System.out.println("Array Elements ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.arraycopy(arr, 0, temp, 0, d);

        System.out.println();

        System.out.println("Temp Array Elements Stored ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }

        System.out.println();
        System.out.println("Array Elements After Rotation ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
