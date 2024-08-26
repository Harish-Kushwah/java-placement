package sorting;

public class CountingSort {

    public static int getMax(int arr[],int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public static void countSort(int arr[] , int n){
        
        int hash[] = new int[getMax(arr, n)+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        for(int i=0;i<hash.length-1; i++){
            hash[i+1] +=hash[i];
        }

        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            hash[arr[i]]--;
            ans[hash[arr[i]]] = arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = ans[i];
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
        countSort(arr, n);
        printArr(arr, n);
    }
}
