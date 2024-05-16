package pracslip;

public class Prime {
    public static void main(String[] args) {
            int number = 5;

            if(isPrime(number)){
                System.out.print("\n" + number +  " is a prime number ");
            }
            else{
                System.out.println(number + "is not prime number ");
            }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {   
                return false;
            }

        }
            return true;
    }
}