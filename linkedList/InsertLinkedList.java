// package linkedList;
class InsLL{
    private Node head ;
    private Node tail;
    private int size;

    InsLL(){
        this.size = 0;
    }
    // Insert At start
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    // Insert At end
    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    // Insert at particular index
    public void insertAtIndex(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    // Display or print Linked List
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(" -> "+temp.value+" and its next is "+temp.next);
            temp = temp.next;
        }
    }

// Single node class
    private class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value = val;
        }
        public Node(int val,Node next){
            this.value = val;
            this.next = next;
        }
    }
}

public class InsertLinkedList {
    public static void main(String[] args) {
        InsLL l = new InsLL();
        l.insertFirst(22);
        l.insertFirst(2);
        l.insertFirst(9);
        l.insertLast(0);
        l.insertLast(10);
        l.insertAtIndex(222, 3);

        l.display();
    }
}
