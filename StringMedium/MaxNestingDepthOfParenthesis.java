package StringMedium;

public  class MaxNestingDepthOfParenthesis {
	public static int maxDepth(String s) {
        int c = 0;
        int ans = 0;
        for(char ch:s.toCharArray()) {
            if(ch=='(') {
                c++;
                ans = Math.max(ans,c);
                continue;
            }else if(ch==')'){
                if(c>0)
                c--;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		String s="(1+(2*3)+((8)/4))+1";
		int ans=maxDepth(s);
		System.out.println(ans);
		
	}

}
