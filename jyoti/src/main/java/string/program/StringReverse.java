package string.program;

public class StringReverse {
    
    public StringReverse() {
        
    }
    
    public void execute() {
        String out = reverse("My name is jyoti");
        System.out.println(out);
        
        
        out = reverse("SDgSgsfgsf");
        System.out.println(out);
        
        out = reverse(null);
        
    }
    
    public String reverse(String str) {
        
        if(str == null || str.length() == 0) {
            return " invalid string";
        }
        
       String reverse ="";
       for (int i = str.length() -1; i>=0; i--){
           reverse = reverse + str.charAt(i);
           
       }
       return reverse;
               
    }

}
