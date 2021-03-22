package HW_6;
import java.util.Arrays;

public class Cipher_2 {
    public static void main(String[] args) {

        String in = "Q@QQ@#$QQAAAFF$%FFFFooorrrrr#rrEEEEEvvvvvvveeerr#@$yyyyyyoooo%%%$#onee#$%ee@@@#ee%$$#";
        char[] inToChar = in.toCharArray();
        char[] intermediate = new char[100];
        char[] result = new char[30];
        int k = 0;
        int k1 = 0;

        // Del "@#$%"
        for (int i = 0; i < inToChar.length; i++) {
            if (inToChar[i] == '@' || inToChar[i] == '#' || inToChar[i] == '$' || inToChar[i] == '%') {
                k++;
            } else {
                intermediate[i - k] = inToChar[i];
            }
        }

        // Del duplicates
        result[0] = intermediate[0];
        for (int i = 1; i < intermediate.length; i++) {
            if (intermediate[i] == intermediate[i-1]) {
                k1++;
            } else {
                result[i - k1] = intermediate[i];
            }
        }

        // Print result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}