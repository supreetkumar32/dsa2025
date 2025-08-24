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

	
	//array
//	class Solution {
//	    public List<List<Integer>> subsets(int[] nums) {
//	        List<List<Integer>> result = new ArrayList<>();
//	        backtrack(0, nums, new ArrayList<>(), result);
//	        return result;
//	    }
//
//	    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
//	        // Base case: if we processed all elements
//	        if (index == nums.length) {
//	            result.add(new ArrayList<>(current)); // add copy of current subset
//	            return;
//	        }
//
//	        // Choice 1: include nums[index]
//	        current.add(nums[index]);
//	        backtrack(index + 1, nums, current, result);
//
//	        // Backtrack (undo the choice)
//	        current.remove(current.size() - 1);
//
//	        // Choice 2: exclude nums[index]
//	        backtrack(index + 1, nums, current, result);
//	    }
//	}
}
