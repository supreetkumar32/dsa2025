package ArrayMedium;

public class buysellstock {

	public static void main(String[] args) {
		int nums[]= {10,7,5,8,11,9};
		int n=nums.length;
		
		//optimal
		int minPrice=Integer.MAX_VALUE;
		int profit=0;
		for(int i=0;i<n;i++) {
			minPrice=Math.min(minPrice, nums[i]);
			profit=Math.max(profit, nums[i]-minPrice);
			
		}
		System.out.println(profit);
		
		
		//brute force
//		int profit=0;
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				int res=nums[j]-nums[i];
//				profit=Math.max(res, profit);
//			}
//		}
//		System.out.println(profit);
	}

}
