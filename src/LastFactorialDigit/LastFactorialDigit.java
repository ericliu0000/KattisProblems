import java.util.Scanner;

public class LastFactorialDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numInput = Integer.parseInt(input.nextLine());

		for (int i = 0; i < numInput; i++) {
			char[] chars = String.valueOf(factorial(Integer.parseInt(input.nextLine()))).toCharArray();
			// System.out.println(chars);
			System.out.println(chars[chars.length - 1]);
		}

		input.close();
	}

	private static int factorial(int x) {
		int out = 1;
		for (int i = 1; i <= x; i++) out *= i;
		return out;
	}
}