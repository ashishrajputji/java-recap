package stackQueue;
class MyQueue{
    private int arr[];
    private static int defsize = 10;
    static int end = 0;
    public MyQueue(){
        this(defsize);
    }
    public MyQueue(int size){
        arr = new int[size];
    }
    public boolean isEmpty(){
        return end==0;
    }
    public boolean isFull(){
        return end==arr.length;
    }
    public boolean add(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is already full");
        }
        arr[end] = item;
        end++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = arr[0];
        for(int i=0;i<end-1;i++){
            arr[i] = arr[i+1];
        } end--;
        return removed;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return arr[0];
    }
    public void display(){
        for (int i : arr) {
            System.out.print(i+" ");
        } System.out.println();
    }
}
public class CustomQueue {
    public static void main(String[] args) throws Exception {
        MyQueue m = new MyQueue(5);
        m.add(22);
        m.add(23);
        m.add(24);
        m.add(25);
        m.add(26);
        m.display();
        System.out.println();
        m.remove();
        m.add(30);
        m.display();
        
    }
}
