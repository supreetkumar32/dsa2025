package array;

import java.util.ArrayList;
import java.util.HashSet;

public class prac {

	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5,6};
//		int b[]= {3,6};
//		int i=a.length-1;
//		int j=b.length-1;
//		int sum=0,carry=0;
//		ArrayList<Integer> al=new ArrayList<>();
//		while(i>=0 && j>=0) {
//			int val1=a[i];
//			int val2=b[j];
//			sum=val1+val2+carry;
//			carry=sum/10;
//			sum=sum%10;
//			al.add(sum);
//			i--;
//			j--;
//					
//		}
//		while(i>=0) {
//			sum=a[i]+carry;
//			 carry=sum/10;
//			 sum=sum%10;
//			 al.add(sum);
//			 i--;
//		}
//		
//		while(j>=0) {
//			sum=a[j]+carry;
//			 carry=sum/10;
//			 sum=sum%10;
//			 al.add(sum);
//			 j--;
//		}
//		while(carry!=0) {
//			sum=carry;
//			carry=sum/10;
//			 sum=sum%10;
//			 al.add(sum);
//		}
		
		int nums[]= {-1,1,3,5,6};
		 int max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++){
	            if(max<nums[i] && nums[i]>=0){
	                max=nums[i];
	            }
	        }
	        System.out.println(max);
		

	}

}
