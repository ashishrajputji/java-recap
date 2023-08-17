package functions;
import java.util.Scanner;
public class avg3 {
    public static int averageOfThree(int num1, int num2, int num3){
        return (num1 + num2 + num3)/3;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a , b , c;
        System.out.println("Enter three numbers to find their average ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();
        System.out.print("Average is :"+averageOfThree(a,b,c));
    }
}
