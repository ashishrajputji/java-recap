package oops;
class FirstPolymorphism{
    String name;
    int age;
    public void printName(){
        System.out.println("Method overloading to perform polymorphism");
    }
    public void printName(String name, int age){
        System.out.print("Name is "+name+" and age is "+age);
    }
    FirstPolymorphism(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Name Before "+name+" age before "+age);
    }
}
public class MyPolymorphism {
    public static void main(String[] args) {
        FirstPolymorphism fp = new FirstPolymorphism("Ashish Rajput", 18);
        fp.printName();
        fp.printName("Khushi",21);
    }
}
