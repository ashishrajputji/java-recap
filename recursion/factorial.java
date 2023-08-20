package recursion;
import java.util.*;
public class factorial {
    public static void printFactorial(int n,int fact){
        if(n==0){
            System.out.println(fact); 
            return;
        }
        fact = fact*n;
        printFactorial(n-1, fact);
    }
    public static void main(String[] args) {
        int n,fact=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit for factorial");
        n = scan.nextInt();
        scan.close();
        printFactorial(n, fact);
    }
    
}
