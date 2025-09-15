public class StringsLenConcatePri {
    public static void main(String[] args) {
        String fullname = "Sujay M Mundaragi";
        System.out.println("Length - " + fullname.length());

        String name = "Sujay";
        String age = "24";

        System.out.println("Name - "+name + " Age- " + age);

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }
}
