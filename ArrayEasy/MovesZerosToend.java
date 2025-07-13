package ArrayEasy;

public class MovesZerosToend {

	public static void main(String[] args) {
		int nums[]= {0, 1, 4, 0, 5, 2};
//		int j=0;
//		int n=nums.length;
//		for(int i=0;i<n;i++) {
//			if(nums[i]!=0) {
//				nums[j]=nums[i];
//				j++;
//			}
//		}
//		for(int k=j;k<n;k++) {
//			nums[k]=0;
//		}
//		
		
		//using 2 pointer
		int j=0;int n=nums.length;
		for(int i=0;i<n;i++) {
			if(nums[i]==0) {
				j=i;
				break;
			}
		}
		
		for(int i=j+1;i<n;i++) {
			if(nums[i]!=0) {
				int temp=nums[j];
				nums[j]=nums[i];
				nums[i]=temp;
				j++;
			}
		}
				
		for(int x:nums) {
			System.out.print(x+" ");
		}

	}

}
