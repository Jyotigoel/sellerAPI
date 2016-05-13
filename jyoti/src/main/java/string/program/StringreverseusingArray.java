package string.program;



public class StringreverseusingArray {
    public StringreverseusingArray() {

    }

    public void execute() {
        int[] iArray = new int[] { 101, 102, 103, 104, 105 };
        String[] sArray = new String[] { "one", "two", "three", "four", "five" };
        
        int[] out = stringreverarraycode(iArray);
        System.out.println(out);
        

    }

    public int[] stringreverarraycode(int[] array) {
        int arrlen = array.length;
        int[] result=new int[array.length];

        if (array.length == 0) {
            System.out.println("Invalid string");

        }

        for (int i = arrlen - 1; i >= 0; i--) {
            result[arrlen - i - 1] = array[i];

        }
        return result;
    }

}
