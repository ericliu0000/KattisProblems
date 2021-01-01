import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] text = input.nextLine().split(" ");
            int len = Integer.parseInt(text[0]);
            int angle = Integer.parseInt(text[1]);

            System.out.println((int) Math.ceil(len/(Math.sin(Math.toRadians(angle)))));
        }
    }
}