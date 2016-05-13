package jyoti;

public class PrimeNumber{
    public boolean PrimeCheck(int number){
        for(int i =2 ; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
    
    return true;
    }
    public static void main(String args[]){
        PrimeNumber mpc = new PrimeNumber();
        System.out.println("Is prime number" + mpc.PrimeCheck(3));
    }


}
