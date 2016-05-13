package Number;

import java.util.Scanner;

public class PalendromeNumber {
    
    public void execute(){
        
        System.out.println("Please enter a Number");
        int givennumber = new Scanner(System.in).nextInt();
        int number = givennumber;
        int reverse = 0;
        while (number != 0){
            int rem = number % 10;
            reverse = reverse * 10 +rem;
            number = number / 10;
            
        }
        if(givennumber == reverse){
            System.out.println("Result : Palendrome");
        }else{
            System.out.println("Result : Not Palendrome");
        }
                
        
    }

}
