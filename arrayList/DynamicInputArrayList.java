package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class DynamicInputArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("How many elements you want to add initially");
        n = scan.nextInt();
        int size = list.size();
        for(int i=size;i<size+n;i++){
            System.out.println("Enter element");
            list.add(i,scan.nextInt());
        }
        scan.close();
        System.out.println(list);
    }
}
