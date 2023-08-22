package strings;

import java.util.Scanner;

public class stringCRUD {
    public static void findChar(StringBuilder sb,char ch){
        for(int i=0;i<=sb.length()-1;i++){
            if(sb.charAt(i)==ch){
                System.out.println("Character found at index "+i);
            }
        }
    }
    public static void deleteChar(StringBuilder sb, char ch){
         for(int i=0;i<=sb.length()-1;i++){
            if(sb.charAt(i)==ch){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        char ch;
        System.out.println("Enter character to perform operations in string");
        ch = scan.next().charAt(0);
        System.out.println("What you want to do enter s to search and d to delete");
        switch(scan.next().charAt(0)){
            case 's':
                findChar(sb, ch);
                break;
            case 'd':
                deleteChar(sb, ch);
                break;
            default:
                System.out.println("Invalid input");
        }
        scan.close();
    }

}
