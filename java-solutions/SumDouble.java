import java.util.Arrays;

public class SumDouble {
    public static void main(String[] args) {
        double result = 0.0;
        for (String arg : args) {
            result += parse(arg);
        }
        System.out.println(result);
    }

    public static double parse(String arg) {
        int leftInd = 0;
        double result = 0;
        for (int j = 0; j < arg.length(); j++) {
            char now = arg.charAt(j);
            char last = j > 0 ? arg.charAt(j - 1) : ' ';
            if (Character.isWhitespace(now)) {
                if (!Character.isWhitespace(last)) {
                    String number = arg.substring(leftInd, j);
                    result += Double.parseDouble(number);
                }

            } else {
                if (Character.isWhitespace(last)) {
                    leftInd = j;
                }
            }
        }
        if (!Character.isWhitespace(arg.charAt(arg.length() - 1))) {
            String ch = arg.substring(leftInd);
            result += Double.parseDouble(ch);
        }
        return (double) result;
    }
}
