package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetC {
	
	//random order: no duplicates (HashSet) (O(1))
//  Set<Integer> set = new HashSet<>();
	
	//same order as we put elements: no duplicates (LinkedHashSet)
	 //Set<Integer> set = new LinkedHashSet<>();
	
	//sorted and no duplicates (It implemnets the binary search tree in backend) (O(logn))
//  Set<Integer> set = new TreeSet<>();

	public static void main(String[] args) {
		
//        Set<Student> studentSet = new HashSet<>();
//
//        studentSet.add(new Student("Anuj", 2));
//        studentSet.add(new Student("Ramesh", 4));
//        studentSet.add(new Student("Shivam", 3));
//
//        studentSet.add(new Student("Rohit", 2));
//
//        Student s1 = new Student("Anuj", 2);
//        Student s2 = new Student("Rohit", 2);
//
//        System.out.println(s1.equals(s2));
//        System.out.println(studentSet);

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();

//        Set<Integer> set = new TreeSet<>();
//
//        set.add(32);
//        set.add(2);
//        set.add(54);
//        set.add(21);
//        set.add(65);
//
//        System.out.println(set);
//
//        set.remove(54);
//
//        System.out.println(set);
//
//        System.out.println(set.contains(21));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();
//
//        System.out.println(set);
		
		Set<Integer> s=new LinkedHashSet<>();
		s.add(19);
		s.add(12);
		s.add(12);
		s.add(35);
		System.out.print(s);

	}

}
