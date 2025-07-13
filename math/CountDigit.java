package math;

public class CountDigit {

	public static void main(String[] args) {
        int x=567;
        int count=0;
        while(x>0) {
        	x=x/10;
        	count++;
        }
        System.out.print(count);
        
        //optimal
        //int cnt = (int) (Math.log10(x) + 1);

	}

}
