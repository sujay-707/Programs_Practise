
public class MissingNum {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 6};
        int n = arr.length + 1;

        for (int i = 1; i <= n; i++) {
            int found = 0; 

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                System.out.println("Missing number is: " + i);
            }
        }
    }
}
