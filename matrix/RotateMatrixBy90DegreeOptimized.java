package matrix;

	import java.util.Arrays;

	public class RotateMatrixBy90DegreeOptimized {

	    // In-place rotation of the matrix by 90 degrees clockwise
	    static void rotate(int[][] matrix) {
	        int n = matrix.length;

	        // Transpose the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < i; j++) {
	                // Swap matrix[i][j] with matrix[j][i]
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

	        // Reverse each row
	        for (int i = 0; i < n; i++) {
	            reverseRow(matrix[i]);
	        }
	    }

	    // Helper method to reverse a single row
	    static void reverseRow(int[] row) {
	        int left = 0, right = row.length - 1;
	        while (left < right) {
	            int temp = row[left];
	            row[left] = row[right];
	            row[right] = temp;
	            left++;
	            right--;
	        }
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        rotate(matrix);

	        System.out.println("Rotated Matrix (90 degrees in-place):");
	        for (int[] row : matrix) {
	            System.out.println(Arrays.toString(row));
	        }
	    }

}
