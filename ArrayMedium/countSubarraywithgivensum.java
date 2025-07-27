package ArrayMedium;

import java.util.HashMap;

//https://www.youtube.com/watch?v=S6tARGbBGEo
public class countSubarraywithgivensum {

	public static void main(String[] args) {
		int[] nums = {10, 5, 2, 7, 1, 9, 15};
		//prefixSum   10  15 17 24 25 34 49
		//int[] nums = {1,1,1};
		int target=15;
		int n=nums.length;
		
		//efficient 
        HashMap<Integer, Integer> mpp=new HashMap<>();//we store the sum vs count(how many times it occurs)	
        int preSum = 0, cnt = 0;
        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            int remaining = preSum - target;

            cnt += mpp.getOrDefault(remaining, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
    	System.out.println(cnt);
    }
	
	//alternate
//	for (int i = 0; i < n; i++) {
//	    preSum += nums[i];
//	    int remaining = preSum - target;
//
//	    // Instead of getOrDefault(remaining, 0)
//	    if (mpp.containsKey(remaining)) {
//	        cnt += mpp.get(remaining);
//	    }
//
//	    // Instead of mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1)
//	    if (mpp.containsKey(preSum)) {
//	        mpp.put(preSum, mpp.get(preSum) + 1);
//	    } else {
//	        mpp.put(preSum, 1);
//	    }
//	}



}
