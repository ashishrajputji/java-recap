package oops;
abstract class Company{
    void investment(){
        System.out.println("Invested 2 Billion dollar");
    }
    abstract void shareValue();
}
class Investors extends  Company{
    int value;
    Investors(int v){
        this.value = v;
    }
    @Override
    void shareValue(){
        System.out.println("Share value is "+value);
    }
}
public class AbstractionPractice {
    public static void main(String[] args) {
    Investors i = new Investors(220);
    i.shareValue();   
    }
}
