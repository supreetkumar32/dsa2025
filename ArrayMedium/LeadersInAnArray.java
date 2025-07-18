package ArrayMedium;

import java.util.ArrayList;

public class LeadersInAnArray {

	public static void main(String[] args) {
		int nums[] = {1, 2, 5, 3, 1, 2};
		int n=nums.length;
		
		//efficient
		ArrayList<Integer> al=new ArrayList<>();
		int max=nums[n-1];
		al.add(max);
		for(int i=n-2;i>=0;i--) {
			if(nums[i]>max) {
				al.add(nums[i]);
				max=nums[i];
			}
		}
		
		for(int x:al){
			System.out.print(x+" ");
		}
		
		
		//brute force
//		ArrayList<Integer> al=new ArrayList<>();
//		for(int i=0;i<n;i++) {
//			boolean leader=true;
//			for(int j=i+1;j<n;j++) {
//				if(nums[j]>nums[i]) {
//					leader=false;
//					break;
//				}
//			}
//			if(leader) {
//				al.add(nums[i]);
//			}
//		}
//		for(int x:al) {
//			System.out.print(x+" ");
//		}

	}

}
