import java.util.ArrayList;
import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Object[] s = split(input.nextLine(), ' ');
        input.close();

        int day = 0;
        String output = "";

        int[] monthLengths = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < (int) s[1]; i++) {
            day += monthLengths[i];
        }
        day += (int) s[0];
        day = (Math.abs(day - 4)) % 7;

        switch (day) {
            case 0:
                output = "Monday";
                break;
            case 1:
                output = "Tuesday";
                break;
            case 2:
                output = "Wednesday";
                break;
            case 3:
                output = "Thursday";
                break;
            case 4:
                output = "Friday";
                break;
            case 5:
                output = "Saturday";
                break;
            case 6:
                output = "Sunday";
                break;
        }
        System.out.println(output);
//        System.out.println(day);
    }

    public static Object[] split(String x, char delim) {
        ArrayList<Integer> out = new ArrayList<>();
        String temp = "";

        for (char i : x.toCharArray()) {
            if (i != delim) {
                temp += i;
            } else {
                out.add(Integer.valueOf(temp));
                temp = "";
            }
        }
        out.add(Integer.valueOf(temp));
        return out.toArray();
    }

}
