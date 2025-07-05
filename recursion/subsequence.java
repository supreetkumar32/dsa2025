package recursion;

public class subsequence {

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
		String str="Hello";
		printSubsequence(str,"");
	}

}
