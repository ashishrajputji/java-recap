package oops;
class Garage{
    void park(Car c){
        System.out.println("Argument object variable value "+c.name);
    }
}
class Car{
    String name;
    Car(String Name){
        this.name = Name;
    }
    Car(Car cn){
        System.out.println("Copy constructor "+cn.name);
    }
}
public class ObjAsArgs {
    public static void main(String[] args) {
        Car c1 = new Car("Volvo");
        Car c2 = new Car(c1);
        Garage g = new Garage();
        g.park(c1);
    }
}
