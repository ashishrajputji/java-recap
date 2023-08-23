package oops;

import java.util.Scanner;

class Base{
    String name;
    int age , numOfWheels,numOfDoors;
}
class Child extends Base{
    String type;
    void getter(){
        System.out.println("Vehicle name is "+name);
        System.out.println(type+"  age is "+age+" and number of wheels is "+numOfWheels+" and is "+numOfDoors+" "+type);
    }
    Child(String type){
        this.type = type;
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter type of Vehicle like Car, Truck, semi-truck, bus, etc...");
        Child c = new Child(scan.nextLine());
        System.out.println("Enter name of vehicle ");
        c.name = scan.nextLine();
        System.out.println("Enter age of Vehicle");
        c.age  = scan.nextInt();
        System.out.println("Enter number of wheels of vehicle");
        c.numOfWheels = scan.nextInt();
        System.out.println("Enter number of doors of vehicle");
        c.numOfDoors = scan.nextInt();
      
        scan.close();
        c.getter();
    }
}
