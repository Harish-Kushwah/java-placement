package sorting;
public class HeapSort {

    public static void maxHeapify(int arr[],int i,int n){
        int parent = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left<n && arr[parent]<arr[left]){
            parent = left;
        }
        if(right<n && arr[parent]<arr[right]){
            parent = right;
        }

        if(parent != i){
            int t = arr[parent];
            arr[parent] = arr[i];
            arr[i] = t;

            maxHeapify(arr,parent,n);
        }
    }
    public static void heapSort(int []arr,int n){
        for(int i=n/2;i>=0;i--){
            maxHeapify(arr,i,n);
        }

        for(int i=n-1;i>=0;i--){
            int t = arr[i];
            arr[i] = arr[0];
            arr[0] = t;

            maxHeapify(arr, 0, i);

        }
    }

    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = new int[]{1,3,4,2,5,2,1};
        int n = arr.length;
        printArr(arr, n);
        heapSort(arr, n);
        printArr(arr, n);
    }
}
