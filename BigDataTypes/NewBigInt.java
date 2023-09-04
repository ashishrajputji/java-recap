package BigDataTypes;
import java.math.BigInteger;
public class NewBigInt {
    public static void main(String[] args) {
        //way 1 decalaration take value of max size of integer only
        BigInteger a = BigInteger.valueOf(23223);
        // way 2 can take very very large value
        BigInteger b = new BigInteger("12345665432");

        //add two big integer
        BigInteger sum = a.add(b);
        System.out.println(sum);

        //subtract
        BigInteger sub = b.subtract(a);
        System.out.println(sub);

        //multiply
        BigInteger mul = b.multiply(a);
        System.out.println(mul);

        //divide
        BigInteger div = b.divide(a);
        System.out.println(div);

        //modulus or remainder
        BigInteger rem = b.remainder(a);
        System.out.println(rem);

        

    }
}
