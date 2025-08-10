package StringMedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {

	    public static String frequencySort(String s) {
	        // Step 1: Count frequencies
	        Map<Character, Integer> freq = new HashMap<>();
	        for (char c : s.toCharArray()) {
	            freq.put(c, freq.getOrDefault(c, 0) + 1);
	        }

	        // Step 2: Sort characters by frequency (in descending order)
	        List<Character> chars = new ArrayList<>(freq.keySet());
	        chars.sort((a, b) -> freq.get(b) - freq.get(a)); // descending

	        // Step 3: Build result
	        StringBuilder sb = new StringBuilder();
	        for (char c : chars) {
	            int count = freq.get(c);
	            for (int i = 0; i < count; i++) {
	                sb.append(c);
	            }
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        String input = "tree";
	        String sorted = frequencySort(input);
	        System.out.println(sorted);  // Output: "eetr" or "eert"
	    }
	


}
