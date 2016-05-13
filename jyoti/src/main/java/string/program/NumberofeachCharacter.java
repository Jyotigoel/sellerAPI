package string.program;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;


public class NumberofeachCharacter implements Observer {

    public void execute() {
        String input = "abcdabcdef";
        System.out.println(EachCharacterInString(input));

    }

    public Map<Character, Integer> EachCharacterInString(String str) {
        int len = str.length();
        Map<Character, Integer> numchars = new HashMap<Character, Integer>();

        for (int i = 0; i < len; ++i) {
            char charAt = str.charAt(i);
            if (!numchars.containsKey(charAt)) {
                numchars.put(charAt, 1);
            } else {
                int a = numchars.get(charAt);
                numchars.put(charAt, numchars.get(charAt) + 1);
            }
        }

        return numchars;

    }

    public void update(Observable arg0, Object arg1) {
        // TODO Auto-generated method stub
        
    }

}
