package basics.dataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    /*
    Members within a queue are accessed using FIFO - First In, First Out

     */

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }

}
