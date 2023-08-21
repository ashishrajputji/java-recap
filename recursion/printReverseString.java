package recursion;
import  java.util.*;
public class printReverseString {
    public static void reverseString(String s,int i){
        if(i==-1){ return;}
        System.out.print(s.charAt(i));
        reverseString(s, i-1);
    }
    public static void main(String[] args) {
        String str;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to reverse : ");
        str = scan.nextLine();
        scan.close();
        int i = str.length()-1;
        reverseString(str, i);
    }
}
