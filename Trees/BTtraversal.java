package Trees;
import java.util.Scanner;
public class BTtraversal {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    protected Node root;
    public void insert(Scanner scan){
        System.out.println("Enter value of root node ");
        int value = scan.nextInt();
        root = new Node(value);
        insert(root,scan);
    }
    private void insert(Node node,Scanner scan){
        System.out.println("Do you want to enter left child of "+node.value);
        boolean left = scan.nextBoolean();
        if(left){
            System.out.println("Enter left Child Value ---");
            int value = scan.nextInt();
            node.left = new Node(value);
            insert(node.left,scan);
        }
         System.out.println("Do you want to enter right child of "+node.value);
        boolean right = scan.nextBoolean();
        if(right){
            System.out.println("Enter right Child Value ---");
            int value = scan.nextInt();
            node.right = new Node(value);
            insert(node.right,scan);
        }
    }
    // Pre order Displaing elements   N --->  L    -----> R
    public void displayPreOrder(){
        displayPreOrder(root);
    }
    private void displayPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        displayPreOrder(node.left);
        displayPreOrder(node.right);
    }
     // In order Displaing elements   L --->  R    -----> N
    public void displayInOrder(){
        displayInOrder(root);
    }
    private void displayInOrder(Node node){
        if(node == null){
            return;
        }
        
        displayInOrder(node.left);
        System.out.println(node.value);
        displayInOrder(node.right);
    }
    // Post order Displaing elements   L --->  R    -----> N
    public void displayPostOrder(){
        displayPostOrder(root);
    }
    private void displayPostOrder(Node node){
        if(node == null){
            return;
        }
        
        displayPostOrder(node.left);
        displayPostOrder(node.right);
        System.out.println(node.value);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BTtraversal tree = new BTtraversal();
        tree.insert(scan);
        System.out.println("Display PreOrder \n");
        tree.displayPreOrder();
        System.out.println("Display Inorder \n");
        tree.displayInOrder();
        System.out.println("Display Post order \n");
        tree.displayPostOrder();
    }
}
