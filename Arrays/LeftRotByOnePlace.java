public class LeftRotByOnePlace {
    public static void leftRot(int arr[]) {
        int temp = arr[0];
        int n = arr.length;

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];

        }
        arr[n - 1] = temp;
       
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        

        leftRot(arr);
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  + " ");
        }

    }
}