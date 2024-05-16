package pracslip;

public class Armstrong {
     public static void main(String[] args) {
        int number = 5;
        
        if (isArmstrong(number)) {
            System.out.print( " " + number + " is an Armstrong number.");
        } else {
            System.out.println(" " + number + " is not an Armstrong number.");
        }
    }
    
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int numDigits = String.valueOf(n).length();
        
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }
        
        return sum == originalNumber;
    }
}
