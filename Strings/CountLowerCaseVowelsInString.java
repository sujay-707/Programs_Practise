import java.util.Scanner;

public class CountLowerCaseVowelsInString {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(str.charAt(i) + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count of vowels lowercase is = " + count);
    }

}
