package recursion;

import java.util.ArrayList;

public class KeyPad {
	
	public static ArrayList<String> getCombinations(String a){
		String codes[]= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
		if(a.length()==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}
		
		char ch=a.charAt(0);//7
		String rem=a.substring(1);//8 9
		ArrayList<String> rres=getCombinations(rem);//[vy,vz.wy,wz,xy,xz]
		ArrayList<String> ans=new ArrayList<>();
		
		String codeForCh=codes[ch -'0'];//tu
		for(int i=0;i<codeForCh.length();i++) {
			char chCode=codeForCh.charAt(i);
			for(String z:rres) {
				ans.add(chCode+z);
			}
		}
		
		return ans;//[tvy, tvz, twy, twz, txy, txz, uvy, uvz, uwy, uwz, uxy, uxz]
	}
	
	
	public static void main(String[] args) {
		String str="789";
//		ArrayList<String> ans=getCombinations(str);
//		System.out.println(ans);
		
		//another approach
		printKPC(str,"");
	}
	
	static String code[]= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void printKPC(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		String codeforch=code[ch-'0'];
		for(int i=0;i<codeforch.length();i++) {
			char cho=codeforch.charAt(i);
			printKPC(roq,ans+cho);
		}
		
	}
	
	///////////////////////////////////

}
