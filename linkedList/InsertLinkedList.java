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
    }
}
