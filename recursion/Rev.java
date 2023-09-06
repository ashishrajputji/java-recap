package recursion;

public class Rev {
    static int reverse(int n){
        int digits = (int)(Math.log10(n))+1;
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,digits)) + reverse(n/10);
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }
}
