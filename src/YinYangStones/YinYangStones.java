import java.util.Scanner;

public class YinYangStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] in = input.nextLine().toCharArray();
        input.close();

        int w = 0, b = 0;

        for (char i : in) {
            if (i == 'W') w++;
            else b++;
        }

        System.out.println((Math.abs(w - b) == 0) ? 1 : 0);
    }
}
