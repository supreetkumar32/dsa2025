package recursion;

public class getStairPath {

	public static void climbingStairs(int curr,int n,String ans) {
		if(curr==n) {
			System.out.println(ans);
			return;
		}
		if(curr+1<=n) {
			climbingStairs(curr+1,n,ans+"1");
		}
		if(curr+2<=n) {
			climbingStairs(curr+2,n,ans+"2");
		}
		if(curr+3<=n) {
			climbingStairs(curr+3,n,ans+"3");
		}
	}
	public static void main(String[] args) {
		climbingStairs(0,5,"");

	}

}
