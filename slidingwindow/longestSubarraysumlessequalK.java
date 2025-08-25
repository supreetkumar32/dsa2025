package slidingwindow;

//1. constant window
//2.longest subarray with condition
//3. no of subarrays where condition
//4.shortest/minimum window condition
public class longestSubarraysumlessequalK {
	public static void bruteForce(int[] a,int k) {
		int maxlen=0;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=i;j<a.length;j++) {
				sum+=a[j];
				if(sum<=k) {
					maxlen=Math.max(maxlen, j-i+1);
				}else if(sum>k) {
					break;
				}
			}
		}
		System.out.println(maxlen);
	}
	
	private static void betterApproachSlidingWindow(int[] a, int k) {
		int maxlen=0,sum=0,l=0,r=0;
		for(r=0;r<a.length;r++) {
			sum=sum+a[r];
			while(sum>k) {
				sum=sum-a[l];
				l=l+1;
			}
			if(sum<=k) {
				maxlen=Math.max(maxlen, r-l+1);
			}
		}
		System.out.println("better "+maxlen);
	}
	
	private static void optimalApproachSlidingWindow(int[] a, int k) {
		int maxlen=0,sum=0,l=0,r=0;
		for(r=0;r<a.length;r++) {
			sum=sum+a[r];
			if(sum>k) {
				sum=sum-a[l];
				l=l+1;
			}
			if(sum<=k) {
				maxlen=Math.max(maxlen, r-l+1);
			}
		}
		System.out.println("optimal "+maxlen);
	}


	public static void main(String[] args) {
		int a[]= {2,0,5,1,7,10};
		int k=14;
		bruteForce(a,k);
		betterApproachSlidingWindow(a,k);
		optimalApproachSlidingWindow(a,k);

	}



}
