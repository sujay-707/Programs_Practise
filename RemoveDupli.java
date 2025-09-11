public class RemoveDupli {

    public static int dupRem(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };

          System.out.println("Array Elements ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
      
        int dupRes = dupRem(arr);
        System.out.println("Unique Count Found - "+dupRes);

        System.out.print("After Removing Duplicates - ");

        for (int k = 0; k < dupRes; k++) {
            System.out.print(arr[k] + " ");
        }
    }

}
