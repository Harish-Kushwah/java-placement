package recursion;

public class IsArraySorted {

    public static boolean isSorted(int arr[],int n,int i)
    {
        if(i==n-1){
            return true;
        }
        if(arr[i+1]<=arr[i]){
            return false;
        }
        return isSorted(arr, n, ++i);
    }
    public static void main(String[] args) {
        int arr[] = {2,3};
        int len  = arr.length;
        if(isSorted(arr,len,0)){
            System.out.println("Array is strictly sorted");
        }
        else{
            System.out.println("Array is not strictly sorted");
        }
    }
}
