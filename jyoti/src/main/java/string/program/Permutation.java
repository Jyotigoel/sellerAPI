package string.program;

import java.util.ArrayList;
import java.util.List;

import org.apache.xml.resolver.apps.resolver;

public class Permutation {
    /*  ArrayList   */
    
    public Permutation(){
        
        
    }
    
    public void execute(){
        
        String a = "abc";
        List<String> b = new ArrayList<String>();
        b = permutationmethod(a);
                
        System.out.println(b);
        
    }
    
    public List<String> permutationmethod(String num){
        List<String> result = new ArrayList<String>();
        if (num == null || num.length() == 0){
            return result;
        }
        
        if (num.length() == 1){
            result.add(num);
            return result;          
        }
        char initial =num.charAt(0);
        String rem = num.substring(1);
        List<String> words = permutationmethod(rem);
        for(String strnew : words){
            for(int i =0 ; i<=strnew.length() ; i++){
                result.add(strnew);
                result.add(String.valueOf(initial));
                result.add(charInsert(strnew , initial , i));
            }
        }
        
        return result;
    }
    
    public static String charInsert(String str, char c , int j){
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
        
    }
    
    

}

