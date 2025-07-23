package binarySearchBasic;

public class lastOccurenceOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find upperbound-1
		int v[]= {1,2,3,4,8,8,8,9};
		int n=v.length;
		int key=8;
		 int start = 0;
		    int end = n - 1;
		    int res = -1;

		    while (start <= end) {
		      int mid = start + (end - start) / 2;
		      if (v[mid] == key) {
		        res = mid;
		        start = mid + 1;

		      } else if (key < v[mid]) {
		        end = mid - 1;
		      } else {
		        start = mid + 1;
		      }
		    }

        System.out.println(res);
        
        //using binary search
//        public static int lastOccurrence(int[] arr, int n, int k) {
//            int low = 0, high = n - 1;
//            int last = -1;
//
//            while (low <= high) {
//                int mid = (low + high) / 2;
//                // maybe an answer
//                if (arr[mid] == k) {
//                    last = mid;
//                    // look for larger index on the right
//                    low = mid + 1;
//                } else if (arr[mid] < k) {
//                    low = mid + 1; // look on the right
//                } else {
//                    high = mid - 1; // look on the left
//                }
//            }
//            return last;
//        }


	}

}
