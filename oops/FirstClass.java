package oops;
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
        Hello obj1 = new Hello();
        obj1.getter();

        obj1.setter("Hello World string is updated");
        obj1.getter();
    }
}
