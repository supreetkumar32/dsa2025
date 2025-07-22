package binarySearchBasic;

public class Code {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,7,8,9,12,13};
		int target=1;
		int l=0;
		int h=a.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(a[mid]==target) {
				System.out.println("element found");
				return;
			}
			else if(a[mid]<target) {
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		System.out.println("element not found");
			

	}

}
