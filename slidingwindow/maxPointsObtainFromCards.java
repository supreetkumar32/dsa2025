package slidingwindow;

public class maxPointsObtainFromCards {
	
	private static int maxpoints(int[] a, int k) {
		int lsum=0,rsum=0,maxsum=0;
		for(int i=0;i<k;i++) {
			lsum=lsum+a[i];
		}
		maxsum=lsum;
		int rindex=a.length-1;
		for (int i=k-1;i>=0;i--) {
			lsum=lsum-a[i];
			rsum=rsum+a[rindex];
			rindex=rindex-1;
			maxsum=Math.max(maxsum, lsum+rsum);
		}
		return maxsum;
		
	}


	public static void main(String[] args) {
	 int a[]= {6,2,3,4,7,2,1,7,1};
	 int k=4;
	 int ans=maxpoints(a,k);
	 System.out.println(ans);
	}


}
