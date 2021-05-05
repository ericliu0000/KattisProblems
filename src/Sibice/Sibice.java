import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int w = input.nextInt();
            int h = input.nextInt();
            input.nextLine();

            for (int i = 0; i < n; i++) {
                double hypotenuse = Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2));
                if (Double.parseDouble(input.nextLine()) > hypotenuse) {
                    System.out.println("NE");
                } else {
                    System.out.println("DA");
                }
            }
        }
    }
}