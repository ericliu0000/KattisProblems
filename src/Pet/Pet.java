import java.util.ArrayList;
import java.util.Scanner;

public class Pet {

	public static void main(String[] args) {
		int maxScore = 0, num = 0;
		Scanner input = new Scanner(System.in);
		int[] values = new int[5];

		for (int i = 0; i < 5; i++) {
			int sum = 0;
			ArrayList<String> x = splitStrings(input.nextLine(), ' ');
			for (String j : x) {
				sum += Integer.valueOf(j);
			}
			values[i] = sum;
			// System.out.println(sum);
		}

		for (int i = 0; i < values.length; i++) {
			if (values[i] > maxScore) {
				maxScore = values[i];
				num = i;
			}
		}

		System.out.println(String.valueOf(num + 1) + " " + String.valueOf(maxScore));

		input.close();

	}

	public static ArrayList<String> splitStrings(String x, char delim) {
		ArrayList<String> out = new ArrayList<>();
		String temp = "";

		for (char i : x.toCharArray()) {
			if (i != delim) {
				temp += i;
			} else {
				out.add(temp);
				temp = "";
			}
		}
		out.add(temp);
		return out;
	}
}