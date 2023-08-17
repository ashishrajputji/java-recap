package functions;
import java.util.Scanner;
public class fibonacci {
    public static void fib(int limit) {
        int first = 0; int second = 1;
        if(limit>2){
            System.out.print(first +" "+ second);
            int next;
            for(int i=3;i<=limit;i++){
                next = first + second;
                System.out.print(" "+next);
                first = second;
                second = next;
            }
        } else if(limit==2){
            System.out.println(first +" "+ second);
        } else if(limit == 1){
            System.out.println(first);
        } else {
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit = scan.nextInt();
        scan.close();
        fib(limit);
    }
}
