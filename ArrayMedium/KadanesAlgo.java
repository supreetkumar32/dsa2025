package ArrayMedium;
//maxium subarray sum
public class KadanesAlgo {

	public static void main(String[] args) {
		
		int arr[]= {2, 3, 5, -2, 7, -4};
		 int maxi = Integer.MIN_VALUE; // maximum sum
	        int sum = 0;
	        int n=arr.length;
	        for (int i = 0; i < n; i++) {
	            sum += arr[i];
	            if (sum > maxi) {
	                maxi = sum;
	            }
	          //   If sum < 0: discard the sum calculated
	            if (sum < 0) {
	                sum = 0;
	            }
	        }
	        System.out.println(maxi);
	    }

	}


