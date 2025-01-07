package array;

public class findallduplicates {
	
//1 to N-1 tak number present hai
	//so 1 duplicate element is there 
	//we have to find that duplicate element
	public static void main(String[] args) {
		int a[]= {4,3,2,7,8,2,3,1};
		List<Integer> l=new ArrayList<>();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(hs.contains(a[i])) {
				l.add(a[i]);
			}else {
				hs.add(a[i]);
			}
		}
		for(int x:l) {
			System.out.println(x);
		}
	}
	

}
