package string.program;

public class EncodeString {
    public EncodeString() {

    }

    public void execute() {
        int out = encodeStringfun("123");
        System.out.println(out);

    }

    public int encodeStringfun(String str) {
        if (str.length() == 0) {
            System.out.println("Empty string");
        }
        int i1 = str.length() - 1;
        int result = 0;
        for (int i = 0; i <= i1; i++) {
            char comstr = str.charAt(i);
            if (comstr == '0' || comstr == '1' || comstr == '2' || comstr == '4') {
                result = result + 2;
            } else if (comstr == '3' || comstr == '5' || comstr == '6' || comstr == '7') {
                result = result + 1;
            } else {
                result = result + 0;
            }
        }
        return result;
    }

}
