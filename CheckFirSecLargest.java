public class CheckFirSecLargest {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 6, 8 };

        int largest = arr[0];
        int secLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }


        System.out.println("Array Elements -");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("First Largest - " + largest);
        System.out.println("Second Largest - " + secLargest);
    }
}