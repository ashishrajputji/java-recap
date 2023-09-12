package stackQueue;

class MyStack {
    protected static  int arr [];
    private static int defsize = 10;
    private static int ptr = -1;

    public MyStack(){
        this(defsize);
    }
    public MyStack(int size){
        arr = new int[size];
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Empty stack unable to pop");
        }
        ptr++;
        arr[ptr] = item;
    }
    public  int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty stack unable to pop");
        }
        return arr[ptr--];

    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty stack unable to peek.");
        }
        return arr[ptr];
    }
    private static boolean isFull(){
        return ptr == arr.length-1;
    } 
    private static boolean isEmpty(){
        return ptr==-1;
    }
    public void display(){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class CustomStack{
    public static void main(String[] args) throws Exception{
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(40);
        stack.push(32);
        stack.push(22);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(12);
        stack.display();
    }
}
