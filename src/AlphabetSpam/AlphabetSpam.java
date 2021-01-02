import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Double[] count = new Double[] {0d, 0d, 0d, 0d};
        String text;

        try (Scanner input = new Scanner(System.in)) {
            text = input.nextLine();
        }

        for (char i : text.toCharArray()) {
            int num = (int) i;
            if (num == 95) {
                count[0]++;
            } else if ((num >= 97) && (num <= 122)) {
                count[1]++;
            } else if ((num >= 65) && (num <= 90)) {
                count[2]++;
            } else {
                count[3]++;
            }
        }

        for (double i : count) {
            System.out.println(i / text.length());
        }
    }
}