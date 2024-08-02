package sorting;


public class QuickSort {

    //average case time complexity : O(nlog(n)) worst case O(n^2)
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
        
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex = partition(arr,low,high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,4};
        int n = 5;
        quickSort(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }


}
