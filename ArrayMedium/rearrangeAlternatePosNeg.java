package ArrayMedium;

import java.util.ArrayList;

public class rearrangeAlternatePosNeg {

	public static void main(String[] args) {
		int nums[]= {1,-4,6,3,6,-3,-5,-4};
		int n=nums.length;
		int pos=0;
		int neg=1;
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
            a.add(0);
        }
		for(int i=0;i<n;i++) {
			if(nums[i]>0) {
				a.set(pos, nums[i]);
				pos+=2;
			}else {
				a.set(neg, nums[i]);
				neg+=2;
			}
		}
		for(int x:a) {
			System.out.print(x+" ");
		}
//		int[] a=new int[n];
//		for(int i=0;i<n;i++) {
//			if(nums[i]>0) {
//				a[pos]=nums[i];
//				pos+=2;
//			}else {
//				a[neg]=nums[i];
//				neg+=2;
//			}
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+ " ");
//		}
	}

}
