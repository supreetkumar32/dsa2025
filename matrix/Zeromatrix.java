package matrix;
import java.util.*;

public class Zeromatrix {
    
    // Mark all non-zero elements in row 'i' as -1
    static void markRow(int[][] matrix, int n, int m, int i) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    // Mark all non-zero elements in column 'j' as -1
    static void markCol(int[][] matrix, int n, int m, int j) {
        for (int i = 0; i < n; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    // Main logic to convert matrix according to 0 positions
    static int[][] zeroMatrix(int[][] matrix, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }

        // Replace all -1 with 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (int[] row : ans) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
