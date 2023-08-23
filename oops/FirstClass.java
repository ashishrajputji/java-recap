package oops;

import java.util.Scanner;

class Hello{
    private String h = "Hello";
    void getter(){
        System.out.println(h);
    }
    void setter(String st){
        h = st;
    }
}
public class FirstClass {
    public static void main(String[] args) {
        char input;
        Hello obj1 = new Hello();
        obj1.getter();
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to change string enter Y to confirm");
        input = scan.next().charAt(0);
        if(input == 'y' || input == 'Y'){
            System.out.println("Enter new string");
            obj1.setter(scan.nextLine());
        }
        scan.close();
        obj1.getter();
    }
}
