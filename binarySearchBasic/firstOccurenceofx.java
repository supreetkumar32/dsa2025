package binarySearchBasic;

public class firstOccurenceofx {

	public static void main(String[] args) {
		//find the lower bound : a[index]>=x
		int arr[]= {1,2,3,4,8,8,8,9};
		int n=arr.length;
		int x=8;
        int low = 0, high = n - 1;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                //look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        System.out.println(ans);
	}
	
	//using binary search
	 public static int firstOccurrence(int[] arr, int n, int k) {
	        int low = 0, high = n - 1;
	        int first = -1;

	        while (low <= high) {
	            int mid = (low + high) / 2;
	            // maybe an answer
	            if (arr[mid] == k) {
	                first = mid;
	                // look for smaller index on the left
	                high = mid - 1;
	            } else if (arr[mid] < k) {
	                low = mid + 1; // look on the right
	            } else {
	                high = mid - 1; // look on the left
	            }
	        }
	        return first;
	    }

}
