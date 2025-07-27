package ArrayHard;

import java.util.Arrays;

public class MergeSortedArrayWithoutExtraSpace {

	public static void main(String[] args) {
		int a[] = {-5, -2, 4, 5};
		int b[] = {-3, 1, 8};
		int m=a.length,n=b.length;
		int left=m-1,right=0;
		while(left>=0 && right<n) {
			if(a[left]>=b[right]) {
				int temp=a[left];
				a[left]=b[right];
				b[right]=temp;
				left--;
				right++;
			}else {
				break;
			}
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int x:a) {
			System.out.print(x+ " ");
		}
		for(int y: b) {
			System.out.print(y+" ");
		}

	}

}
