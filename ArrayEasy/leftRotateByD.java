package ArrayEasy;

import java.util.ArrayList;

public class leftRotateByD {

	public static void reverse(int nums[], int a,int b) {
		while(a<b) {
			int temp=nums[a];
			nums[a]=nums[b];
			nums[b]=temp;
			a++;b--;
		}
	}

	public static void main(String[] args) {
		 int nums[]= { 1,2,3,4,5,6,7,8};
		 
		 //brute force
//		 int d=3;
//		 ArrayList<Integer> al=new ArrayList<>();
//		 for(int i=0;i<d;i++) {
//			 al.add(nums[i]);
//		 }
//		 for(int i=d;i<nums.length;i++) {
//			 nums[i-d]=nums[i];
//		 }
//		 int j=0;
//		 for(int i=nums.length-d;i<nums.length;i++) {
//			 nums[i]=al.get(j);
//			 j++;
//		 }
//		 
//		 for(int x: nums) {
//			 System.out.print(x+" ");
//		 }
		 
		 //optimal solution
//		 question:           1,2,3,     4,5,6,7,8
//		 reverse first d (3):3,2,1      8,7,6,5,4
//		 reverse the whole   :4,5,6,7,8,1,2,3
		 
		 int d=4;
		 int n=nums.length;
		 reverse(nums,0,d-1);
		 reverse(nums,d,n-1);
		 reverse(nums,0,n-1);
		 for(int x: nums) {
			 System.out.print(x+" ");
		 }
		 
		 
		 
		 

	}

}
