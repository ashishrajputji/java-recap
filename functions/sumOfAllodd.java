package functions;
import java.util.Scanner;
public class sumOfAllodd {
    public static int sumOfAllOdd(int range){
        int sum = 0;
        for(int i=1;i<=range;i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter range you want to find sum of odd numbers ");
        n = scan.nextInt();
        scan.close();
        System.out.println("Sum of odd number is : "+sumOfAllOdd(n));
    }
}
