import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Integer[] expected = new Integer[] {1, 1, 2, 2, 2, 8};
        try (Scanner input = new Scanner(System.in)) {
            for (int i : expected) {
                System.out.print((i - input.nextInt()) + " ");
            }
        }
    }
}