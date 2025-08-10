package StringEasy;

public class RotationOfOther {
	
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String ans=s+s;
        if(ans.contains(goal))
        return true;
        else
        return false;
    }

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		boolean ans=rotateString( s, goal);
		System.out.println(ans);
	}

}
