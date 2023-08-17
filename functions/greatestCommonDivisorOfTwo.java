package functions;
import java.util.Scanner;

public class greatestCommonDivisorOfTwo {
    public static void greatestCommonDivisor(int a, int b){
        int limit, count=0;
        if(a > b){
            limit = b;
        } else {
            limit = a;
        }
        for(int i=1;i<=limit;i++){
            if(a%i==0 && b%i==0){
                count = i;
            }
        }
        if(count == 0){
            System.out.println("No common divisor");
        } else {
            System.out.println("Greatest Common divisor of "+a+" "+b+" is "+count);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two number to find their greatest common divisor ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        scan.close();

        greatestCommonDivisor(num1, num2);
    }
}
