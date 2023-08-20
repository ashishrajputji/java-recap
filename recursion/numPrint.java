package recursion;

public class numPrint {
    public static void naturalNum(int n){
        if(n<1) return;
        System.out.println(n);
        naturalNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        naturalNum(n);
    }
}
