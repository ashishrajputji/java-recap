package recursion;

public class RecCheckSorted {
    static boolean checksortedRec(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<=arr[i+1] && checksortedRec(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7,8};
        if(checksortedRec(arr, 0)){
            System.out.println("Sorted array");
        } else {
            System.out.println("Not sorted array");
        }
    }
}
