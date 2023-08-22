package strings;
import java.util.*;
public class findChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        char ch;
        System.out.println("Enter character to find in string");
        ch = scan.next().charAt(0);
        scan.close();
        for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)==ch){
                System.out.println("Character found at index "+i);
            }
        }
    }
}
