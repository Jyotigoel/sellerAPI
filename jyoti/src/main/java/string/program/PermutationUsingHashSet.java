package string.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationUsingHashSet {

    public void execute() {

        String a = "abc";
        Set<String> b = new HashSet<String>();
        b = permutationmethod(a);

        System.out.println(b);

    }

    public Set<String> permutationmethod(String num) {
        Set<String> result = new HashSet<String>();
        if (num == null || num.length() == 0) {
            return result;
        }

        if (num.length() == 1) {
            result.add(num);
            return result;
        }
        char initial = num.charAt(0);
        String rem = num.substring(1);
        Set<String> words = permutationmethod(rem);
        for (String strnew : words) {
            for (int i = 0; i <= strnew.length(); i++) {
                result.add(strnew);
                result.add(String.valueOf(initial));
                result.add(charInsert(strnew, initial, i));
            }
        }

        return result;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;

    }

}
