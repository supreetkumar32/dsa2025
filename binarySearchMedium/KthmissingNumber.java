package binarySearchMedium;

public class KthmissingNumber {

	//brute force
	 public static int missingK(int[] arr, int n, int k) {
	        for (int i = 0; i < n; i++) {
	            if (arr[i] <= k) k++; //shifting k
	            else break;
	        }
	        return k;
	    }
	    public static void main(String[] args) {
	        int[] arr = {4, 7, 9, 10};
	        int n = 4, k = 4;
	        int ans = missingK(arr, n, k);
	        System.out.println("The missing number is: " + ans);
	    }

}
