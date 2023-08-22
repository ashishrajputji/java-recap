package strings;
import java.util.*;
public class deleteChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        char ch;
        System.out.println("Enter character to delete from the string");
        ch = scan.next().charAt(0);
        scan.close();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==ch){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);

    }
}
