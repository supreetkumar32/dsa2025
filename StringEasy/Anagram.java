package StringEasy;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a= "aabcd";
		String b="cabd";
//		
//		//brute force
//		char aa[]=a.toCharArray();
//		char bb[]=b.toCharArray();
//		Arrays.sort(aa);
//		Arrays.sort(bb);

//		if(aa.length!=bb.length) {
//			System.out.println("it is not an anagram");
//			return;
//		}
//		int n=aa.length;
//		int flag=0;
//		for(int i=0;i<n;i++) {
//			if(aa[i]!=bb[i]) {
//				flag=1;
//			}
//		}
//		if(flag==0) {
//			System.out.println("it is an anagram");
//		}else {
//			System.out.println("it is not an anagram");
//		}
		
		//optimise
		int freq[]=new int[26];
		if(a.length()!=b.length()) {
			System.out.println("It is not an anagram");
			return;
		}
		for(int i=0;i<a.length();i++) {
			char stringa=a.charAt(i);
			int freqindexA=stringa-97;
			freq[freqindexA]+=1;
			
			char stringb=b.charAt(i);
			int freqindexB=stringb-97;
			freq[freqindexB]-=1;
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				System.out.println("It is not an anagram");
				return;
			}
		}
		System.out.println("it is an anagram");
	}

}
