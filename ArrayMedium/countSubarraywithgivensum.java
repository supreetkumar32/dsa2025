package ArrayMedium;

import java.util.HashMap;

public class countSubarraywithgivensum {

	public static void main(String[] args) {
		int[] nums = {10, 5, 2, 7, 1, 9, 15};
		//prefixSum   10  15 17 24 25 34 49
		//int[] nums = {1,1,1};
		int target=15;
		int n=nums.length;
		
		//efficient 
        HashMap<Integer, Integer> mpp=new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            int remove = preSum - target;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
    	System.out.println(cnt);
    }



}
