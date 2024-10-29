package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // to add we have two method
        queue.add(1);
        queue.offer(2);
        queue.add(5);
        queue.offer(6);

        // here we are using another class to print the queue
        Utility.print(queue);

        // to retrieve the head we have two methods
        System.out.println(queue.peek());
        System.out.println(queue.element());

        //to retrieve the head and remove it from the queue
        int headOfQueue = queue.remove();
        System.out.printf("Head of the queue is %d \n",headOfQueue);

        int headOfQueue1 = queue.poll();
        System.out.printf("Head of the queue is %d \n",headOfQueue1);

        // printing the queue
        Utility.print(queue);
    }
}
