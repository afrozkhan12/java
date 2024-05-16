package pracslip;

public class Fibo {
    public static void main(String[] args) {
        int n = 100;
        int a = 0, b = 1;
        
        System.out.println("Fibonacci sequence up to " + n + ":");
        System.out.print(a + " " + b + " ");
        
        while (a + b <= n) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
        }
    }
    
}
