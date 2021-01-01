import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        String[] values;
        int sum = 0;

        try (Scanner input = new Scanner(System.in)) {
            int x = Integer.parseInt(input.nextLine());
            values = new String[x];

            for (int i = 0; i < x; i++) {
                values[i] = input.nextLine();
            }
        }

        for (String i : values) {
            int exponent = Integer.parseInt(i.substring(i.length() - 1));
            int base = Integer.parseInt(i.substring(0, i.length() - 1));
            sum += Math.pow(base, exponent);
        }

        System.out.println(sum);
    }
}