package recursion;
import java.util.*;
public class checkSorted {
    public static boolean checkSortedArray(int a[],int i){
        if(i==a.length-1) return true;
        if(a[i]<a[i+1]){
            return checkSortedArray(a, i+1);
        } else{
            return false;
        }
    }
    public static void main(String args[]){
        int n,first=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements ");
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        if(checkSortedArray(a,first) == true){
            System.out.println("Array is strictly sorted");
        } else {
            System.out.println("Not a sorted array");
        }
    }
}
