package sorting;
import java.util.Scanner;
public class selectionSort {
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
        // Selection Sort
        for(int i=0;i<n;i++){
            int smallest = i;
            for(int j=1+i;j<n;j++){
                if(array[i]>array[j]){
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
                // Printing Sorted array
                for(int i=0;i<n;i++){
                    System.out.print(array[i]+" ");
                }
    }
}
