package StringEasy;

public class LargestOddNumInString {
	
    public static String largestOddNumber(String num) {
        if(num.charAt(num.length()-1)%2==1) return num;
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }

	public static void main(String[] args) {
	String s="65749";
	String ans=largestOddNumber(s);
	System.out.println(ans);
	}

}
