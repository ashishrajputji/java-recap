package BigDataTypes;
import java.io.*;
import java.util.*;
import java.math.*;
public class NewBigDecimal {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       String a [] = new String[n+2];
       for(int i=0;i<n;i++){
           a[i] = scan.next();
       }
       scan.close();
       Comparator<String> myCustomComparator = new Comparator<>(){
       public int compare(String s1,String s2){
           BigDecimal bd1 = new BigDecimal(s1);
           BigDecimal bd2 = new BigDecimal(s2);
           return bd2.compareTo(bd1);
        }
       };
       Arrays.sort(a,0,n,myCustomComparator);
       for(int i=0;i<n;i++){
           System.out.println(a[i].toString());
       }
    }
}
