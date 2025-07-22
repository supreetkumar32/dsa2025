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

	}

}
