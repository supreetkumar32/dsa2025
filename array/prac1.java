package array;

import java.util.ArrayList;
import java.util.Optional;

public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(7);
		a.add(1);
		a.add(100);
		a.add(4);
		a.add(87);
		a.add(8);
		a.add(9);
		
		long startTime = System.nanoTime();
		int z =a.stream().sorted().findFirst().orElse(null);
		System.out.println("z "+z);
		long endTime = System.nanoTime();
		long duration1=endTime-startTime;
		System.out.print(duration1);
		System.out.println();
		long startTime2 = System.nanoTime();
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)<min) {
				min=a.get(i);
			}
		}
		System.out.println("min " +min);
		long endTime2 = System.nanoTime();
		long duration2=endTime2-startTime2;
		System.out.print(duration2);
		
		


	}

}
