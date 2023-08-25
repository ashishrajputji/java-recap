package arrayList;
// import java.util.Collection;
import java.util.ArrayList;
public class GetSetArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements in arrayList
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // get element in arrayList
        System.out.println(list.get(0));

        //set element in arrayList
        list.set(0,1);
        System.out.println(list);

        //add element in between arrayList
        list.add(1,10);
        System.out.println(list);
    }
}
