package recursion;
import java.util.*;
public class find1stLastOcc {
    public static int first = -1;
    public static int last = -1;
    public static void findFirstAndLastOccurence(String s,int i,int len,char el){
        if(i>len) return;
        if(s.charAt(i)==el){
            if(first == -1){
                first = i;
            } else{
                last = i;
            }
        }
        findFirstAndLastOccurence(s, i+1, len, el);
    }
    public static void main(String[] args) {
        String s;
        char el;
        int i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string ");
        s = scan.nextLine();
        System.out.println("Enter character to find occurence in string");
        el = scan.next().charAt(0);
        scan.close();
        int n = s.length()-1;
        findFirstAndLastOccurence(s, i, n, el);

        System.out.println("First occurence is "+first+" and last occurence is  "+last);
    }
}
