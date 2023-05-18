import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseTranspose {
    public static void main(String[] args) {
        List<List<Integer>> numbers = readInput();
        List<List<Integer>> transpose = turn(numbers);
        printOutput(transpose);
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
        return numbers;
    }


    static List<List<Integer>> turn (List<List<Integer>> turnLeft) {
        int rows = turnLeft.size();
        int colum = turnLeft.get(0).size();

        List<List<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < colum; i++) {
            List<Integer> transposeRow = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                transposeRow.add(turnLeft.get(j).get(i));
            }
            transpose.add(transposeRow);
        }

        return transpose;
    }


    static void printOutput(List<List<Integer>> numbers) {
        for (List<Integer> row : numbers) {
            for (Integer integer : row) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
