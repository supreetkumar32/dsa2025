package StringEasy;
import java.util.HashSet;
public class Duplicate {

	public static void main(String[] args) {
		String s="Supreet";
		//char[] a= s.toCharArray();
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(hs.contains(s.charAt(i))){
				System.out.println(s.charAt(i));
			}else {
				hs.add(s.charAt(i));
			}
		}
		

	}

}
