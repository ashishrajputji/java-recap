package sorting;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter size of your array ");
        n = scan.nextInt();
        int array[] = new int[n];
        System.out.println("Enter Array Elements ");
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        scan.close();
        // Bubble sorting array -- n2 time complexity
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        // Printing Sorted array
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
