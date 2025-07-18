	package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//hashMap mey random order: no duplicates
//treeMap mey sort based on keys: no duplicates
public class MapC {

	public static void main(String[] args) {
        //Map<String, Integer> numbers = new TreeMap<>();
		Map<String, Integer> numbers = new HashMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.remove("Three");

//        if(!numbers.containsKey("Two")) {
//            numbers.put("Two", 23);
//        }

//        numbers.putIfAbsent("Two", 23);
        System.out.println(numbers);
        System.out.println(numbers.containsValue(3));

        System.out.println(numbers.isEmpty());

        for (Map.Entry<String, Integer> e: numbers.entrySet()) {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

       for (String key: numbers.keySet()) {
            System.out.println(key);
        }

        for(Integer value: numbers.values()) {
            System.out.println(value);
       }
        
        ////////////////////////making frequency map/////////
        int v[]= {2,3,2,3,5};
        int n=v.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++) {
        	int value=hm.getOrDefault(v[i], 0);
        	hm.put(v[i],value+1);
        	
        }
        for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
        	System.out.println("Element: "+entry.getKey() +" Frequency "+ entry.getValue());
        }
        

	}

}
