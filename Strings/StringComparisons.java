public class StringComparisons {
    public static void main(String[] args) {
        String s1 = "Sujay";
        String s2 = "Sujay";

        String s3 = new String("Sujay");

        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (s1 == s3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Equal using equals");
        }
    }

}
