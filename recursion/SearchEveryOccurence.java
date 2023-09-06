package recursion;

import java.util.ArrayList;

public class SearchEveryOccurence {
    static  ArrayList<Integer> search(int arr[],int target,int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,3,4,5,5,6,7,4};
        ArrayList<Integer> list = search(arr, 3, 0, new ArrayList<Integer>());
        System.out.println(list);
    }
}
