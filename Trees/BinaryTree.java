package Trees;
import java.util.Scanner;
public class BinaryTree {
    private static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;

    // Take input for root node
    public void populate(Scanner scan){
        System.out.println("Enter value for root node :");
        int value = scan.nextInt();
        root = new Node(value);
        populate(scan,root);
    }
    // Takes input for all other nodes except root node
    private void populate(Scanner scan, Node node){
        System.out.println("Do you want to enter left of "+ node.value);
        boolean left = scan.nextBoolean();
        if(left){
            System.out.println("Enter value of left node");
            int value = scan.nextInt();
            node.left = new Node(value);
            populate(scan, node.left);
        }
        System.out.println("Do you want to enter right of "+ node.value);
        boolean right = scan.nextBoolean();
        if(right){
            System.out.println("Enter value of right node");
            int value = scan.nextInt();
            node.right = new Node(value);
            populate(scan, node.right);
        }
    }
    // Display our Binary tree 
   public void display(){
    display(root,"");
   }
   private void display(Node node,String indent){
    if(node == null) return;
    System.out.println(indent + node.value);
    display(node.left, indent +"\t");
    display(node.right, indent +"\t");
   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       BinaryTree bt  = new BinaryTree();
       bt.populate(scan);
       scan.close();
       bt.display();
    }
}
