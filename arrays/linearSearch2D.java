package arrays;
import java.util.Scanner;
public class linearSearch2D {
    public static void main(String[] args) {
        int row, column, x, found = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        row = scan.nextInt();
        System.out.println("Enter number of column ");
        column = scan.nextInt();

        int arr[][] = new int[row][column];
        System.out.println("Enter items of array ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter item to find ");
        x = scan.nextInt();
        scan.close();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j] == x){
                    System.out.println("Item found at index "+i + "" + j);
                    found = 1;
                }
            }
            if(i==row-1 && found == 0) System.out.println("No match found ");
        }
    }
}
