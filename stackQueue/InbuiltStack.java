package stackQueue;
import java.util.Stack;
public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(22);
        st.push(12);
        st.push(12);
        st.push(89);
        st.push(8);
        for(int x : st){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(st.peek());
        System.out.println();
        st.pop();
        st.pop();
        for(int x : st){
            System.out.println(x +" ");
        }
    }
}
