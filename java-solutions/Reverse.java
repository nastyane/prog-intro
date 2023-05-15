import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] s = line.split(" ");
            for (String value : s) {
              
                int v = Integer.parseInt(value);
                list.add(Collections.singletonList(v));
            }
        }
        System.out.print(list + " ");
        int rows = list.size();
        int cols = list.get(0).size();
        int[][] arr = new int[rows][cols];

        // Печать двумерного массива
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



