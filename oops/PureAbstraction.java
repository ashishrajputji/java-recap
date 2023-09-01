package oops;
interface NewCollege{
     void admit();
}
class MSU implements NewCollege{
    public  void admit(){
        System.out.println("Student got admission in MSU");
    }
}
class PIT implements NewCollege{
    public void admit(){
        System.out.println("Student got admission in PIT");
    }
}
public class PureAbstraction {
    public static void main(String[] args) {
        MSU m = new MSU();
        PIT p = new PIT();
        m.admit();
        p.admit();
    }
}
