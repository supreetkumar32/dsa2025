package ArrayEasy;

import java.util.ArrayList;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {1, 2, 7};
		ArrayList<Integer> al=new ArrayList<>();
		int n=a.length;
		int m=b.length;
		int i=0,j=0;
		while(i<n && j<m) {
			if(a[i]<=b[j]) {
				if(al.size()==0 ||al.get(al.size()-1)!=a[i]) {
					al.add(a[i]);
				}
				i++;
			}else {
				if(al.size()==0 ||al.get(al.size()-1)!=b[j]) {
					al.add(b[j]);				
			}
				j++;
		}
	}
		while(i<n) {
			 if (al.get(al.size()-1) != a[i]) {
			    al.add(a[i]);
			       i++;
			 }
		}
		while(j<m) {
			 if (al.get(al.size()-1) != b[j]) {
			al.add(b[j]);
			j++;
			 }
		}
		
		for(int x:al) {
			System.out.print(x+ " ");
		}

	}

}
