import java.util.Arrays;

public class SumDouble {
    public static void main(String[] args) {
        double result = 0.0;
        for (String arg : args) {
            result += parse(arg);
        }
        System.out.println(result);
    }

    private static double parse(String arg) {
        int leftInd = 0;
        double result = 0;
        for (int i = 0; i <= arg.length(); i++) {
            char now = i != arg.length() ? arg.charAt(i) : ' ';
            char last = i > 0 ? arg.charAt(i - 1) : ' ';
            if (Character.isWhitespace(now)) {
                if (!Character.isWhitespace((last))) {
                    String number = arg.substring(leftInd, i);
                    result += Double.parseDouble(number);
                }

            } else {
                if (Character.isWhitespace(last)) {
                    leftInd = i;
                }
            }
        }
        return result;
    }
}
