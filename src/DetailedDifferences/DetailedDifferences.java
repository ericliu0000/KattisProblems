import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {
        char[] s1, s2;
        try (Scanner input = new Scanner(System.in)) {
            int n = Integer.parseInt(input.nextLine());
            String[] out = new String[n];
            for (int i = 0; i < n; i++) {
                s1 = input.nextLine().toCharArray();
                s2 = input.nextLine().toCharArray();
                out[i] = String.valueOf(s1) + "\n" + String.valueOf(s2) + "\n";
                for (int j = 0; j < s1.length; j++) {
                    out[i] += (s1[j] == s2[j]) ? "." : "*";
                }
                out[i] += "\n";
            }
            for (String i : out) {
                System.out.println(i);
            }
        }
    }
}
