package bitManipulation;
import java.util.Scanner;
public class setBit {
    public static void main(String[] args) {
        int n,pos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter element ");
        n = scan.nextInt();
        System.out.println("Enter pos to set bit 1");
        pos = scan.nextInt();
        scan.close();
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
