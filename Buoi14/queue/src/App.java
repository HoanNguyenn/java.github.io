import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("B");
        queue.add("H");
        queue.add("L");

        System.out.println(queue.element());
        System.out.println(queue.peek());
        // khong co se bao la null

        queue.remove();
        System.out.println(queue);

        queue.poll();    // xoa phan tu dau tien va cuoi cung  
        System.out.println(queue);

       Deque <String> deque = new ArrayDeque<>();
       deque.add("Java");
       deque.add("python");
       deque.add("C++");

       System.out.println(deque);

       deque.pollFirst();
       System.out.println(deque);

       deque.offer("SQL");
       deque.push("Kotlin");
       System.out.println(deque);

       };
    
}
