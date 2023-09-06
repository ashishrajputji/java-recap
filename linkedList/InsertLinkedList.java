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

    // Deletion of elements in LinkedList
    // Delete First
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head.next == null){
            tail.next = null;
        }
        size--;
        return value;
    }
    // Delete Last element
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public int DeleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        Node SecondLast = get(size-2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        return val;
    }
    // Delete at any Index
    public int Delete(int index){
        if(index <= 1){
            return deleteFirst();
        }
        if(index == size-1){
            return DeleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;
    }

    // Find any node
    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                return temp;
            }
        }
        return null;
    }

    // Display or print Linked List
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(" -> "+temp.value);
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

        System.out.println("\n After deleting head value "+l.deleteFirst());
        l.display();

        System.out.println("\n After deleting tail value "+l.DeleteLast());
        l.display();
        System.out.println("\n After deleting at index  value "+l.Delete(2));
        l.display();


        System.err.println("\n Element found whose node address is \t"+l.find(2));
    }
}
