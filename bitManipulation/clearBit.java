package bitManipulation;

import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        int n,pos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter element ");
        n = scan.nextInt();
        System.out.println("Enter pos to clear bit");
        pos = scan.nextInt();
        scan.close();
        int bitMask = 1<<pos;
        int newNumber = ~(bitMask) & n;
        System.out.println(newNumber);
    }
}
