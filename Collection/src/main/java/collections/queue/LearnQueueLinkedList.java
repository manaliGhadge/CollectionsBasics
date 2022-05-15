package collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueueLinkedList {
    // First In First out datatype.
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<>();

        // offer() - data data in queue.
        queue.offer(2);
        queue.offer(4);
        queue.offer(6);
        queue.offer(8);
        queue.offer(10);
        queue.offer(12);

        System.out.println(queue);

        // poll() - removes first element.
        queue.poll();

        System.out.println(queue);

        // peek() - next element to be removed.
        System.out.println(queue.peek());

        // add(), element(), remove() same as offer(), peek(), poll() respectively.
        // but, these functions throw exception in case of false.
    }
}
