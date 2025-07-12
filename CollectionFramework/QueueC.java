package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//first in first out
public class QueueC {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);//adding the elements in queue
        queue.offer(24);
        queue.offer(36);
        
        Iterator iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println(queue);

        System.out.println(queue.poll());//removing the element

        System.out.println(queue);

        System.out.println(queue.peek());//returns the head of queue
        
//        [12, 24, 36]
//        12
//        [24, 36]
//        24

	}

}
