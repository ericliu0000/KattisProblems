import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        boolean[] cups = new boolean[]{true, false, false};
        try (Scanner input = new Scanner(System.in)) {
            String x = input.nextLine();
            for (char i : x.toCharArray()) {
                switch (i) {
                    case 'A':
                        boolean l = cups[0];
                        cups[0] = cups[1];
                        cups[1] = l;
                        break;
                    case 'B':
                        boolean m = cups[1];
                        cups[1] = cups[2];
                        cups[2] = m;
                        break;
                    case 'C':
                        boolean r = cups[2];
                        cups[2] = cups[0];
                        cups[0] = r;
                        break;
                    default:
                        break;
                }
            }
        }
        for (int i = 0; i < cups.length; i++) {
            if (cups[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}