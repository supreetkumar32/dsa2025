package binarySearchMedium;

public class squareRoot {

	public static void main(String[] args) {
		int n=45;//finding square root of n
		int l=1,h=45,ans=1;//answer lies between 1 to 45
		//now we have to apply binary search on answers
		while(l<=h) {
			int mid=(l+h)/2;
			if(mid*mid <=n) {
				ans=mid;
				l=mid+1;
			}else {
				h=mid-1;
			}
		}
		System.out.println(ans);
	}
}
		//brute force
//	int n=45;
//	int ans=0;
//	for(int i=1;i<n;i++) {
//		if(i*i<=n) {
//			ans=i;
//		}else{
//			break;
//		}
//	}
//	System.out.println(ans);
//	}

//}
