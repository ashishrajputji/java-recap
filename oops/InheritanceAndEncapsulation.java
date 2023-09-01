package oops;
// Parent Class
class Institute{
    String instituteName, Specialization;
    Institute(String in){
        this.instituteName = in;
    }
}
// Child of Institute Class
class StudentDetails extends Institute{
    private String name,clas;
    private int age , rno;
    StudentDetails(String InstName){
        super( InstName);
    }

    public void setter(int rno, int age, String name, String cls, String spec){
        this.name = name;
        this.age = age;
        this.rno  = rno;
        this.clas = cls;
        super.Specialization = spec;
    }
    public void getter(){
        System.out.println("Student details are ");
        System.out.println("Name is "+name+" roll no "+rno+" class is "+clas+" and Age is "+age+" Institute is "+instituteName+" and Institute is specialised in "+Specialization);
    }

}
// Main Class
public class InheritanceAndEncapsulation {
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails("M S U");
        sd.setter(1,22,"Ashish","12th","Engineering");
        sd.getter();
    }
}
