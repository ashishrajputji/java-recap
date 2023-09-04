package stringBuff;

import java.util.Random;

class RandStr{
    static String generate(int n){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();

        for(int i=0;i<n;i++){
            int randomChar = 97 + (int)(random.nextFloat()*26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}
public class RandomString {
    public static void main(String[] args) {
        
        System.out.println(RandStr.generate(20));;
    }
}
