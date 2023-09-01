import java.util.Scanner;

public class PallindromeNum {
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.close();
        int revNum = 0, n=num;
        for(;num!=0;){
            revNum = revNum*10 +num%10;
            num = num/10;
        }
        if(n == revNum) System.out.println("Pallindrome number");
    }
}
