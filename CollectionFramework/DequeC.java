package CollectionFramework;

import java.util.ArrayDeque;

public class DequeC {

	public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " +adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " +adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " +adq);
        
//        [12, 23, 45, 26]
//        		12
//        		12
//        		26
//        		12
//        		poll() [23, 45, 26]
//        		23
//        		pollFirst() [45, 26]
//        		26
//        		pollLast() [45]
	}

}
