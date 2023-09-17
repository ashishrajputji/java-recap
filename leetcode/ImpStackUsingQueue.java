package leetcode;
import java.util.*;
class MyStack {
Deque<Integer> q1;
    public MyStack() {
        q1 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        q1.addLast(x);
    }
    
    public int pop() {
        return q1.removeLast();
    }
    
    public int top() {
        return q1.peekLast();
    }
    
    public boolean empty() {
        return q1.size()==0;
    }
}

public class ImpStackUsingQueue {
    
    public static void main(String[] args) {
         MyStack obj = new MyStack();
         for(int i=0;i<10;i++){
             obj.push(i);
         }
         int param_2 = obj.pop();
         System.out.println(param_2);
         int param_3 = obj.top();
         System.out.println(param_3);
         boolean param_4 = obj.empty();
         System.out.println(param_4);
    }
}
