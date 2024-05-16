package pracslip;

// import java.util.Scanner;

public class Reverse {
     public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        int number = 12345;
        
        int reversedNumber = reverse(number);
        
        System.out.println("Reversed number: " + reversedNumber);
    }
    
    // Function to reverse a number
    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
