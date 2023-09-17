package leetcode;
class LastWord {
    public static int lengthOfLastWord(String s) {
        int count =0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            } else{
                if(count>0) break;
                continue;
            }
        } return count;
            }
}
public class LastWordLength{
    public static void main(String[] args) {
        int len = LastWord.lengthOfLastWord("return the length of last word   ");
        System.out.println(len);
    }
}