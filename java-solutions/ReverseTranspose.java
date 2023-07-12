import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseTranspose {
    public static void main(String[] args) {
        List<List<Integer>> numbers = readInput();
//        System.err.println("=".repeat(40));
//        System.err.println("*".repeat(10) + " numbers:");
//        dump(numbers);
        List<List<Integer>> transpose = maxSize(numbers);
//        System.err.println("*".repeat(10) + " transpose:");
//        dump(transpose);
        printOutput(transpose);
    }

//    static void dump(List<List<Integer>> numbers) {
//        for (List<Integer> row : numbers) {
//            for (Integer integer : row) {
//                if (integer == null) {
//                    System.err.print("  ");
//                } else {
//                    System.err.print(integer + " ");
//                }
//            }
//            System.err.println();
//        }
//    }

    static void printOutput(List<List<Integer>> transpose) {
        for (List<Integer> row : transpose) {
            for (Integer integer : row) {
                if (integer == null) {
                    System.out.print("");
                } else {
                    System.out.print(integer + " ");
                }
            }
            System.out.println();
        }
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
            numbers.add(lineNumbers);
        }
        return numbers;
    }

    static List<List<Integer>> maxSize(List<List<Integer>> turnLeft) {
        int rows = turnLeft.size();
        int maxColums = 0;
        for (int i = 0; i < rows; i++) {
            if (maxColums < turnLeft.get(i).size()) {
                maxColums = turnLeft.get(i).size();
            }
        }
        List<List<Integer>> transpose = new ArrayList<>();
        for (int col = 0; col < maxColums; col++) {
            transpose.add(new ArrayList<>());
            for (int row = 0; row < rows; row++) {
                if (turnLeft.get(row).size() > col) {
                    transpose.get(col).add(turnLeft.get(row).get(col));
                } else {
                    transpose.get(col).add(null);
                }

            }
        }

        return transpose;
    }
}