public class StringSubStr {

    public static String SubStrFn(String str, int si, int ei) {
        String subs = "";
        for (int i = si; i < ei; i++) {
            subs = subs + str.charAt(i);

        }
        return subs;
    }

    public static void main(String[] args) {
        String str = "Sujay_Mundaragi";

        System.out.println("From Index 6 to 10 is printed from (6 , 11)");
        System.out.println("11 idx is excluded");
        System.out.println("SubString of " + str + "= "+SubStrFn(str, 6, 11));

    }
}