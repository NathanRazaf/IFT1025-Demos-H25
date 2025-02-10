package Demo7.Queue;

public class Main {
    public static void main(String[] args) {
        ListeQueue queue = new ListeQueue();
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.enqueue(6);
        System.out.println(queue);
        queue.enqueue(7);
        System.out.println(queue);
        queue.enqueue(8);
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}
