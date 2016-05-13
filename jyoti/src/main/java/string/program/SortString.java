package string.program;

public class SortString {
    
    
    public void execute(){
        String original ="bcda";
        System.out.println(stringSorting(original));
              
    }
    
    public char[] stringSorting(String str){
        int j = 0 ;
        char temp = 0;
        
        char[] chars = str.toCharArray();
        for(int i = 0 ; i<chars.length; i++){
            for(j =0 ; j<chars.length; j++){
                if(chars[j] > chars[i]){
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
              
        return chars;
    }
    

}
