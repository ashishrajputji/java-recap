package arrays;

public class forEch {
    public static void main(String[] args) {
            int a[] = {1,2,0,33,22,4,3,43,56,77,566,45,44};
            String student[] = {"Ashish","Munish","Pallav","Vrijesh","Mishra ji","Thakur Sahb","Rajput"};
            double dbnm[] = {1.2222,2.11212,3.32312321, 444444.32312};

            // Printing Integer type  array
            for(int i: a){
                System.out.print(i+" ");
            }
            System.out.println();
            // Printing String type array
            for(String i : student){
                System.out.print(i+" ");
            }
            System.out.println();
            // Printing Double type array
            for(double i : dbnm){
                System.out.print(i);
            }
    }
}
