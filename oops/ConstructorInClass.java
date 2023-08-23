package oops;
import java.util.Scanner;
class FirstConstructor{
    String str;
    int arr[] = new int[5];
    FirstConstructor(String str){
        this.str = str;
    }
    void getter(){
        System.out.println(str);
        for(int i=0; i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ConstructorInClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name ");
        FirstConstructor fc = new FirstConstructor(scan.nextLine());
        System.out.println("Enter array elements ");
        for(int i=0;i<5;i++){
            fc.arr[i] = scan.nextInt();
        }
        scan.close();
        fc.getter();
    }
}
