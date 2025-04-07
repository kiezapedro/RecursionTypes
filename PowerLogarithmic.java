import java.util.Scanner;

public class PowerLogarithmic {

    // Main method - entry point of the program
    public static void main(String[] args) throws Exception {

        // Create a scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        // Read the base (x) and exponant(n)
        System.out.println("Enter the base number: ");
        int x = scn.nextInt();
        System.out.println("Enter the exponent: ");
        int n = scn.nextInt();

        // Call the power method and store the result
        int xpn = power(x, n);

        // Print the result
        System.out.println(xpn);

    }

    // Method to compute the power using logarithmic time complexity (0(log n))
    public static int power(int x, int n) {
        // Base case: x^0 = 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: Compute power for n/2
        int xpnb2 = power(x, n / 2);

        // Calculate x^n using the result for x^(n/2)
        int xn = xpnb2 * xpnb2;

        // If n is odd, multiply the result by x
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }
}