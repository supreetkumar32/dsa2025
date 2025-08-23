package recursion;

import java.util.ArrayList;

public class getStairPath {
	
	public static ArrayList<String> allPaths(int n){
		if(n==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}else if(n<0) {
			ArrayList<String> bres=new ArrayList<>();
			return bres;
		}
		
		ArrayList<String> path1=allPaths(n-1);
		ArrayList<String> path2=allPaths(n-2);
		ArrayList<String> path3=allPaths(n-3);
		ArrayList<String> ans=new ArrayList<String>();
		
		for(String x:path1) {
			ans.add(1+ x);
		}
		for(String x:path2) {
			ans.add(2+ x);
		}
		for(String x:path3) {
			ans.add(3+ x);
		}
		return ans;
	}
	
	
	public static void main(String args[]) {
		int n=4;
		ArrayList<String> paths=allPaths(n);
		System.out.println(paths);
	}

//	public static void climbingStairs(int curr,int n,String ans) {
//		if(curr==n) {
//			System.out.println(ans);
//			return;
//		}
//		if(curr+1<=n) {
//			climbingStairs(curr+1,n,ans+"1");
//		}
//		if(curr+2<=n) {
//			climbingStairs(curr+2,n,ans+"2");
//		}
//		if(curr+3<=n) {
//			climbingStairs(curr+3,n,ans+"3");
//		}
//	}
//	public static void main(String[] args) {
//		climbingStairs(0,5,"");
//
//	}

}
