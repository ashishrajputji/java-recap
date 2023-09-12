package stackQueue;
import java.util.ArrayDeque;
import java.util.Deque;
public class InbuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(23);
        d.addLast(33);
        d.add(43);
        d.addFirst(13);
        System.out.println(d);
        d.remove();
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
    }
}
