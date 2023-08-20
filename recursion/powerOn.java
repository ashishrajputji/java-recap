package recursion;
import java.util.*;
public class powerOn {
    public static void printPower(int x,int n,int pow) {
        if(n==0){
            return;
        }  
        if(x==0){
            System.out.println("0");
            return;
        } 
        pow = pow*x;
            printPower(x, n-1, pow);
            if(n==1) 
            System.out.println("Power is "+pow);
    }
    public static void main(String[] args) {
        int x,n, pown=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ");
        x = scan.nextInt();
        System.out.println("Enter power");
        n = scan.nextInt();
        scan.close();
       printPower(x,n,pown);
    }
}
