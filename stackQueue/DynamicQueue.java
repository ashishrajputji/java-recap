package stackQueue;
class DQ{
    private int [] data;
    private static int defaultSize = 10;
    public int f = 0;
    public int end = 0;
    public int size = 0;

    public DQ(){
        this(defaultSize);
    }
    public DQ(int size){
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean add(int item){
        if(isFull()){
            int temp[] = new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i] = data[(f+i)%data.length];
            }
            f = 0;
            end = data.length;
            data = temp;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Empty queue unable to remove");
        }
        int removed = data[f++];
        f = f % data.length;
        size--;
        return removed;
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        int i = f;
        do{
            System.out.print(data[i]+"->");
            i++;
            i = i%data.length;
        } while(i!=end);
        System.out.println("END");
    }
}

public class DynamicQueue{
    public static void main(String[] args) throws Exception{
        DQ dq = new DQ(3);

        dq.add(30);
        dq.add(40);
        dq.add(50);
        dq.add(60);
        dq.display();
        dq.remove();
        dq.add(70);
        dq.add(80);
        dq.display();
    }

}