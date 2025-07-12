package CollectionFramework;

import java.util.Stack;
//Stack : Last in first out

public class StackC {

	public static void main(String[] args) {
        Stack<String> animals= new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());//Cat

        animals.pop();

        System.out.println("Stack: " + animals);

        System.out.println(animals.peek());
        
        while(!animals.isEmpty()) {
        	System.out.println(animals.pop());
        }
//        Stack: [Lion, Dog, Horse, Cat]
//        		Cat
//        		Stack: [Lion, Dog, Horse]
//        		Horse
//        		Horse
//        		Dog
//        		Lion

	}

}
