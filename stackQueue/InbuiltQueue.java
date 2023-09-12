package stackQueue;
import java.util.LinkedList;
import java.util.Queue;
public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(22);
        q.add(43);
        System.out.println(q);
        System.out.println(q.peek());
        q.add(101);
        q.add(76);
        System.out.println(q);
        q.remove();
        System.out.print(q);
    }
}
