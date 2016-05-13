package string.program;

public class Palindrome {

    public Palindrome() {
        // TODO Auto-generated constructor stub
    }

    public void execute() {
        String isPalindrome = checkPalindrome("abcbd");
        System.out.println(isPalindrome);
    }

    public String checkPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return "Not Palendrome";

        }
        String newword = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newword = newword + str.charAt(i);

        }
        if (newword.equals(str)) {
            return "Palendrome";

        } else {
            return "Not Palendrome";
        }
    }
}
