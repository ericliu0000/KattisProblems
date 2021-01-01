import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < Integer.parseInt(input.nextLine()); i++) {
            System.out.println(i);
            int n = Integer.parseInt(input.nextLine());
            System.out.println(n);
            if ((n % 2) == 0) {
                System.out.println("yea");
                // System.out.printf("%d is even%n", n);
            } else {
                System.out.println("nah");
                // System.out.printf("%d is odd%n", n);
            }
        }
        
        input.close();
    }
}