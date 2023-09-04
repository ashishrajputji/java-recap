package stringBuff;

public class Intro {
    public static void main(String[] args) {
        // Way 1 just create the object and initializing it later
        StringBuffer sb = new StringBuffer();

        //Way 2 defining string inside string buffer at the time of decalaration
        StringBuffer sb2 = new StringBuffer("This is a String buffer text");

        //Way3 defining size of string initially
        StringBuffer sb3 = new StringBuffer(30);

        sb.append("String Buffer build using way 1");
        sb2.append(" and is appended"); //Append string at index 
        // sb2.insert(4," text ");//Insert string at particular index
        // sb2.replace(0,5, "That "); //replace string from begining index inclusive to end index exclusive 
        // sb.delete(0, 7);
        // sb.reverse(); // reverse the give string buffer
        sb3.append("Created by defining size later on and reviewing the size of the String");
        System.out.println(sb.toString());
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
    }
}
