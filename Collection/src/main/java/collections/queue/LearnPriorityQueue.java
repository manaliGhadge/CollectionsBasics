package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    // we can assign priority to specific element in queue.

    public static void main(String args[]) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(2);
        priorityQueue.offer(7);
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        priorityQueue.offer(6);

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());

        // Internally implements min heap. In this smallest element always on top.
        // so, always priority more for smallest element.
        System.out.println(priorityQueue);

        // max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);
        pq.offer(7);
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }

}
