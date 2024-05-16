package pracslip;

public class SqrCube {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Square of " + i + ": " + (i * i));
            } else {
                System.out.println("Cube of " + i + ": " + (i * i * i));
            }
        }
    }
}
