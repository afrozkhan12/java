package pracslip;

public class Floyd {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the Floyd Triangle
        
        int num = 1; // Starting number
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( num + " ");
                num = (num == 1) ? 0 : 1; // Alternate between 0 and 1
            }
            System.out.println();
            if (i % 2 == 0) {
                num = 1; // Reset num to 1 for even rows
            } else {
                num = 0; // Reset num to 0 for odd rows
            }
        }
    }
}
