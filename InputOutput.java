import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  
    System.out.println("Enter username");

    String userName = scan.nextLine();  
    scan.close();
    System.out.println("Username is: " + userName);  
  }
}