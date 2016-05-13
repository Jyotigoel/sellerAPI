package string.program;

public class StringReverseByWord {
    public StringReverseByWord() {

    }

    public void execute() {
        String out = reversebywordfun("My name is jyoti");
        System.out.println(out);

    }

    public String reversebywordfun(String str) {
        if (str == null || str.length() == 0) {
            return " sInvalid String";

        }
        int start = 0;
        int end;
        String result = "";
        StringReverse reverse = new StringReverse();

        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == ' ' ) {
                end = i - 1;
                result = result + reverse.reverse(str.substring(start, i)) + " ";
                start = i + 1;

            }
            if (i==str.length()-1){
                result = result + reverse.reverse(str.substring(start));
            }

        }

        return result;
    }

}
