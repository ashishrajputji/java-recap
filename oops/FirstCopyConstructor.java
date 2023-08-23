package oops;
class Student{
    String schoolName,name;
    int age;
    Student(String sn, String name,int age){
        this.schoolName = sn;
        this.name = name;
        this.age = age;
    }
    Student(Student s2){
        this.schoolName = s2.schoolName;
        this.name = s2.name;
        this.age = s2.age;
    }
    void getter(){
        System.out.println("Name is "+name+" age is "+age+" and school name is "+schoolName);
    }
}
public class FirstCopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("RDS","Ashish Rajput",18);
        Student s2 = new Student(s1);
        s2.getter();
    }
}
