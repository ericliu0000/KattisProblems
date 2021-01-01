import java.util.HashMap;
import java.util.Scanner;

public class NoDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] x = input.nextLine().split(" ");
		HashMap<String, Integer> counts = new HashMap<>();

		input.close();

		for (String i : x) {
			if (counts.get(i) != null) {
				counts.put(i, counts.get(i) + 1);
			} else {
				counts.put(i, 1);
			}
		}

		for (Integer set : counts.values()) {
			if (set > 1) {
				System.out.println("no");
				return;
			}
		}

		System.out.println("yes");
	}
}