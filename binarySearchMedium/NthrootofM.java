package binarySearchMedium;

public class NthrootofM {

	public static void main(String[] args) {
		
		int n=3,m=27;
		int l=0,h=m;
		while(l<=h) {
			int mid=(l+h)/2;
			if(Math.pow(n, mid)==m) {
				System.out.println(mid);
				break;
			}else if(Math.pow(n,mid)<m) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		
	}

}
