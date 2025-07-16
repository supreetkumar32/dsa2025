package ArrayMedium;

import java.util.HashMap;

public class twoSum {

	public static void main(String[] args) {

		int[] nums = {1, 6, 2, 10, 3};
		int n=nums.length;
		int target=7;
	
		//brute force
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println("i "+i+" j "+j);
				}
			}
		}
		
		//efficient
		int ans[]=new int[2];
		ans[0]=-1;
		ans[1]=-1;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hm.containsKey(target-nums[i])) {
				ans[0]=hm.get(target-nums[i]);
				ans[1]=i;
				
			}
			hm.put(nums[i], i);
		}
		
		System.out.println("i "+ans[0]+" j "+ans[1]);

	}

}
