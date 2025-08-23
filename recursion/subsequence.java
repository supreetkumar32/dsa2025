package recursion;

import java.util.ArrayList;

public class subsequence {

	//it will take (n+1) * n
	public static void printSubsequence(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		printSubsequence(roq, ans+ch);
		printSubsequence(roq, ans+"");
	}
	public static void main(String[] args) {
		String str="abc";
		printSubsequence(str,"");
	}
	
	
	//it will take 2^(n-1) * n
//	public static ArrayList<String> getSubSequences(String str){
//		if(str.length()==0) {
//			ArrayList<String> z=new ArrayList<String>();
//			z.add("");
//			return z;
//		}
//		char ch=str.charAt(0);//a
//		String remaining=str.substring(1);//bc
//		ArrayList<String> rres=getSubSequences(remaining);//[--,-c,b-,bc]
//		ArrayList<String> ans=new ArrayList<>();
//		for(String a:rres) {
//			ans.add(""+a);
//			ans.add(ch+a);
//		}
//		return ans;
//		
//	}
//	
//	public static void main(String args[]) {
//		String str="abcdefghibusgdbcfhjcfgrhdcbxmgguhdbis";
//		ArrayList<String> ans=getSubSequences(str);
//		System.out.println(ans);
//	}

}
