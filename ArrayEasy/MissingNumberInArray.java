package ArrayEasy;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] nums = {0, 1,2,4,5,6};
		int sum=0;
		int n=nums.length;
		for(int i=0;i<n;i++) {
			sum+=nums[i];
		}
		int nthsum=n*(n+1)/2;
		int missing=nthsum-sum;
		System.out.print(missing);

	}

}
