package ArrayEasy;

import java.util.HashSet;

public class removeDuplicatesSortedArray {
	
	//brute force
//	 public static void main(String[] args) {
//	        int arr[] = {1,1,2,2,2,3,3};
//	        int k = removeDuplicates(arr);
//	        System.out.println("The array after removing duplicate elements is ");
//	        for (int i = 0; i < k; i++) {
//	            System.out.print(arr[i] + " ");
//	        }
//	    }
//	    static int removeDuplicates(int[] arr) {
//	    	HashSet<Integer> hs=new HashSet<>();
//	    	for(int x: arr) {
//	    		hs.add(x);
//	    	}
//	    	int k=hs.size();
//	    	int j=0;
//	    	for(int x: hs) {
//	    		arr[j]=x;
//	    		j++;
//	    	}
//	    return k;
//	    }
	
	//optimal solution
	public static void main(String args[]) {
	    int arr[] = {1,1,2,2,2,3,3};
	    int i=0;
	    for(int j=1;j<arr.length;j++) {
	    	if(arr[j]!=arr[i]) {
	    		arr[i+1]=arr[j];
	    		i++;
	    	}
	    }
	    System.out.println("size of array" +(i+1));
	}

}
