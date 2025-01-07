package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class duplicateElement {
	
//jo element 2 times aaye hai usko find karna hai
	public static void main(String[] args) {
		int a[]= {1,2,3,4,4,5};
        int sum=0;
        int n=a.length;
        for(int i=0;i<a.length;i++) {
        	sum=sum+a[i];
        }
        int result=sum-(n*(n-1))/2;
		System.out.println(result);
		

	}
	

}
