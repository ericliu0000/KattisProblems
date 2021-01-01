import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PokerHand {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        input.close();
        int max = 0;

        ArrayList<String> cards = splitStrings(in, ' ');
        HashMap<Character, Integer> store = new HashMap<>();

        for (String i : cards) {
            char x = i.toCharArray()[0];
            if (store.containsKey(x)) {
                store.put(x, store.get(x) + 1);
            } else {
                store.put(x, 1);
            }
        }

        for (int i: store.values()) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
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