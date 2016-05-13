package string.program;

import org.junit.experimental.max.MaxCore;

public class TwoStringLastWord_VISA {
    public TwoStringLastWord_VISA() {
        String input1 = "a";
        String input2 = "123";
        String output = mergetwostringlastword(input1, input2);
        System.out.println(output);
    }

    public void execute() {

    }

    public String mergetwostringlastword(String str1, String str2) {
        if ((str1 == null) || (str2 == null)) {
            return " Invalid String";
        }
        int maxlength = str1.length() > str2.length() ? str1.length() : str2.length();
        int str1l = str1.length()-1;
        int str2l = str2.length()-1;
        String result = "";
        for (int i = 0; i < maxlength; i++) {
            if (str1l >= 0) {
                result = result + str1.charAt(str1l);
                str1l--;
            }
            if (str2l >= 0) {
                result = result + str2.charAt(str2l);
                str2l--;
            }

        }

        return result;
    }

}
