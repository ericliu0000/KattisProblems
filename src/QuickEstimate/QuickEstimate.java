import java.util.Scanner;

public class QuickEstimate {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = Integer.parseInt(input.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.println(input.nextLine().toCharArray().length);
            }
        }
    }
}