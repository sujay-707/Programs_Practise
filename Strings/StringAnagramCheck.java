
import java.util.*;

public class StringAnagramCheck {
    public static void main(String[] args) {
        String s1 = "Silent     Listen  ";
        String s2 = "listen     silent   ";
 
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println(s1 + " " + s2 + " are " + "Anagarms ");
        } else {
            System.out.println("Not Anagrams");
        }
    }

}
