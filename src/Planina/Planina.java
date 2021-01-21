import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int k = 2;

            // recursive formula x_n+1 = 2 * x_n - 1 
            for (int i = 0; i < n; i++) {
                k += k - 1;
            }
            System.out.println((int) Math.pow(k, 2));
        }
    }
}