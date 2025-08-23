package recursion;

import java.util.ArrayList;

public class MazePatth {
	
	public static ArrayList<String> getAllPaths(int sr,int sc,int dr,int dc){
		if(sr==dr && sc==dc) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		ArrayList<String> hpaths=new ArrayList<>();
		ArrayList<String> vpaths=new ArrayList<>();
		if(sc<dc) {
			hpaths=getAllPaths(sr,sc+1,dr,dc);
		}
		if(sr<dr) {
			vpaths=getAllPaths(sr+1,sc,dr,dc);
		}
		ArrayList<String> ans=new ArrayList<>();
		for(String horizontal:hpaths) {
			ans.add(horizontal + "h");
		}
		for(String vertical:vpaths) {
			ans.add(vertical + "v");
		}
		return ans;
		
	}
	
	public static void printMazePaths(int sr,int sc,int dr,int dc, String ans){
		
		if(sr>dr || sc>dc) {
			return;
		}
		if(sr==dr && sc==dc) {
			System.out.println(ans);
			return;
		}
		printMazePaths(sr,sc+1,dr,dc,ans+"h");
		printMazePaths(sr+1,sc,dr,dc,ans+"v");
		
	}

	public static void main(String[] args) {
		int n=3,m=3;
		ArrayList<String> paths=getAllPaths(1,1,n,m);
		System.out.println(paths);
		
		printMazePaths(1,1,n,m,"");
	}

}
