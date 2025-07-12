package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueC {

	public static void main(String[] args) {
	//default is the increasing order
		 //Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
        
//        [40, 36, 24, 12]
//        		[36, 12, 24]
//        		36

	}

}
