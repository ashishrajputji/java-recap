package arrays;
import java.util.Scanner;
public class LogSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        int count = 0;
        System.out.println("Enter array elemen");
        for(int i=0;i<5;i++){
            a[i] = scan.nextInt();
        }
        System.out.println("Enter element to search");
        int el = scan.nextInt();
        scan.close();
        // Searching
        int len = a.length;
        for(int i=0,j=len-1;j>=i;i++,j--){
            if(a[i]== el){
                System.out.println("Element found at index "+i);
                break;
            } else if(a[j] == el){
                System.out.println("Element found at index "+j);
            }
            count++;
        }
       System.out.println("Number of iterations taken by program "+count);
    }
}
