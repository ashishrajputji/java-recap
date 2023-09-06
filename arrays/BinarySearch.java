package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
        int target = 5;
        System.out.println("Found at index "+Search(arr, 0, arr.length-1, target));
    }
    static int Search(int arr[],int s,int end,int target){
    if(s>end){
        return -1;
    }
    int mid =s + (end-s)/2;
    if(arr[mid]==target){
        return mid;
    }
    if(target < arr[mid]){
        return Search(arr,s,mid-1,target);
    }
    return Search(arr,mid+1,end,target);
}
}
