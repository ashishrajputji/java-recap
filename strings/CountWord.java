package strings;
import java.util.Scanner;
public class CountWord {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to cound number of words ");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        // String sb = scan.nextLine();
        scan.close();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == ' ' && sb.charAt(i+1) != ' '){
                count++;
            }
        }
        ++count;
        System.out.println("Number of words is  "+count);
    }
}
