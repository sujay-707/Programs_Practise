
public class LargestOddNuminStr {
    public static String LargeOddNoStr(String str) {
        int lastIdx = -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if ((c - '0') % 2 != 0) {
                lastIdx = i;
                break;
            }
        }

        if (lastIdx == -1) {
            return "";
        }

        String result = str.substring(0, lastIdx + 1);

        result = result.replaceFirst("^0+", "");
        return result;
    }

    public static void main(String[] args) {
        String str = "001257926";

        System.out.println(LargeOddNoStr(str));

    }
}
