package binarySearchMedium;
//Given n roses and an array nums where nums[i] denotes that the 'ith' rose will bloom on the nums[i]th day, only adjacent bloomed roses
//can be picked to make a bouquet. Exactly k adjacent bloomed roses are required to make a single bouquet. Find the minimum number of
//days required to make at least m bouquets, each containing k roses. Return -1 if it is not possible.
//Input: n = 8, nums = [7, 7, 7, 7, 13, 11, 12, 7], m = 2, k = 3
//Output: 12
//Explanation: On the 12th the first 4 flowers and the last 3 flowers would have already bloomed. So, we can easily make 2 bouquets,
//one with the first 3 and another with the last 3 flowers.
public class MinimumdaystoMakeMBouqueteOptimal {
	
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }

	  public static int roseGarden(int[] arr, int k, int m) {
	        long val = (long) m * k;
	        int n = arr.length; // Size of the array
	        if (val > n) return -1; // Impossible case.
	        // Find maximum and minimum:
	        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
	        for (int i = 0; i < n; i++) {
	            mini = Math.min(mini, arr[i]);
	            maxi = Math.max(maxi, arr[i]);
	        }
	        int ans=-1;
	        int l=mini;int h=maxi;
	        while(l<=h) {
	        	int mid=(l+h)/2;
	        	if(possible(arr,mid,m,k)) {
	        		ans=mid;
	        		h=mid-1;
	        	}else {
	        		l=mid+1;
	        	}
	        }
	        
	        return ans;
	    }

	    public static void main(String[] args) {
	        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
	        int k = 3;
	        int m = 2;
	        int ans = roseGarden(arr, k, m);
	        if (ans == -1)
	            System.out.println("We cannot make m bouquets.");
	        else
	            System.out.println("We can make bouquets on day " + ans);
	    }

}
