public class StringPalind {
    public static boolean isPalind(String str) {
        int n = str.length();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Not a Palindrome ");
                return false;
            }

        }
        System.out.println("Yes Palindrome -");
        return true;
    }

    public static void main(String[] args) {
        String str = "SUJAY";
        System.out.println(str);
        System.out.println(isPalind(str));

        System.out.println();
        String str2 = "NooN";
        System.out.println(str2);
        System.out.println(isPalind(str2));

    }

}
