package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Functional4 {

	public static void main(String[] args) {
		//output is another list
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);	
		
		List<Integer> doublenumbers=numbers.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.print(doublenumbers);

	}

}
