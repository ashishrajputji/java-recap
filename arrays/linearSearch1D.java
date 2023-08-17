package arrays;
import java.util.*;
public class linearSearch1D {
    public static void main(String[] args) {
        int n,x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of items : ");
        n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array items ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter item to find : ");
        x = scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                System.out.print("Item found at index "+ i);
                break;
            } else if(i == n-1){
                System.out.println("No match found");
            }
        }
    }
}
