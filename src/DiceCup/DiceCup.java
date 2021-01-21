import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        String[] text;

        try (Scanner input = new Scanner(System.in)) {
            text = input.nextLine().split(" ");
        }
        // get text into vars
        int n = Integer.parseInt(text[0]), m = Integer.parseInt(text[1]);
        
        // just count from 1 + the min to 1 + the max
        for (int i = Math.min(n, m); i <= Math.max(n, m); i++) {
            System.out.println(i + 1);
        }
    }
}