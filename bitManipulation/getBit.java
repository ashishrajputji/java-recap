package bitManipulation;
import java.util.Scanner;
public class getBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter an number ");
        n = scan.nextInt();
        int pos;
        System.out.println("Enter position to find bit at that position");
        pos  = scan.nextInt();
        scan.close();
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
