package recursion;

import java.util.Scanner;

public class numSum {
    public static void naturalNumSum(int n,int s){
        if(n==0){
            System.out.println("sum is "+s);
            return;
        } 
        s = s+n;
        naturalNumSum(n-1, s);
    }
    public static void main(String[] args) {
        int n,s=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit :");
        n=scan.nextInt();
        scan.close();
        naturalNumSum(n,s);
    }
}
