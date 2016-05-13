package string.program;

public class Palendromeanothercode {
    public Palendromeanothercode() {

    }

    public void execute() {
        String input = Palendromeanothercodefun("jykj");
        System.out.println(input);

    }

    public String Palendromeanothercodefun(String str) {
        if (str == null)
            return "Not palendrome";
        int length = str.length();
       
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return "Not Palendrome";

            }
        }
        return "String is Palendrome";
    }
}
