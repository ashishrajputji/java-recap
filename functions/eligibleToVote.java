package functions;
import java.util.Scanner;
public class eligibleToVote {
    public static int checkEligibleToVote(int age){
        if(age >= 18) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age ;
        System.out.println("Enter age of voter ");
        age = scan.nextInt();
        scan.close();
        if(checkEligibleToVote(age) == 1){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to Vote");
        }
    }
}
