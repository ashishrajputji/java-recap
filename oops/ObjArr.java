package oops;
// Program ot implement array of object
class Sudent{
    String name;
    Sudent(String name){
        this.name = name;
    }
}
public class ObjArr {
    public static void main(String[] args) {
        Sudent s1 = new Sudent("Ashish");
        Sudent s2 = new Sudent("Munish");
        Sudent[] S = {s1,s2};
        System.out.println(S[0].name);
        System.out.println(S[1].name);
    }
}
