package recursion;
import java.util.*;
public class moveXtoback {
    public static String finals="";
    public static int count=0;
    public static void moveAllxToBack(String s,int i){
        if(i==s.length()) return;
        if(s.charAt(i)!='x'){
            finals = finals+s.charAt(i);
            moveAllxToBack(s, i+1);
        } else{
            count++;
            moveAllxToBack(s, i+1);
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to move all x to back");
        str = scan.nextLine();
        scan.close();
        moveAllxToBack(str,0);
        for(int i=0;i<count;i++){
            finals+='x';
        }
        System.out.println(finals);
    }
}
