package collections.queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    // can insert & delete element from both side of queue.

    public static void main(String args[]) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // offer() - normal add
        ad.offer(1);
        ad.offer(2);
        ad.offer(3);

        System.out.println(ad);

        // offerFirst() - add element in first.
        ad.offerFirst(10);
        // offerLast() - add element in last.
        ad.offerLast(20);

        System.out.println(ad);

        // peek() - next element to be removed.
        System.out.println(ad.peek());

        // pollFirst() - normal remove from head.
        System.out.println(ad.pollFirst());

        // peekLast() - remove last element.
        System.out.println(ad.pollLast());

        System.out.println(ad);

    }
}
