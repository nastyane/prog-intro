import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        List<List<Integer>> numbers = readInput();
        System.err.println("*".repeat(10));
        printOutput(numbers);

    }

    static List<List<Integer>> readInput() {
        List<List<Integer>> numbers = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            List<Integer> lineNumbers = new ArrayList<>();
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                int number = lineScanner.nextInt();
                lineNumbers.add(number);
            }
            System.err.println(lineNumbers);
            numbers.add(lineNumbers);
        }
        Collections.reverse(numbers);
        return numbers;
    }

    static void printOutput(List<List<Integer>> numbers) {
        for (List<Integer> lineNumbers : numbers) {
                for (int i = lineNumbers.size() - 1; i >= 0; i--) {
                    System.out.print(lineNumbers.get(i) + " ");
                }
            System.out.println();
        }
    }
}
