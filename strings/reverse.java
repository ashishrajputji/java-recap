package strings;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.nextLine());
        scan.close();
        for(int i=0;i<sb.length()/2;i++){
            int start = i;
            int end = sb.length()-1-i;
            char firstChar = sb.charAt(start);
            char lastChar = sb.charAt(end);

            sb.setCharAt(end, firstChar);
            sb.setCharAt(start, lastChar);
        }
        System.out.println(sb);
    }
}
