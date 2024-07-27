package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int len = arr.length;

        //time complexity = O(n^2)
        //bubble sort
        for(int i=0;i<len-1;i++)   //n-1
        {
            for(int j=0;j<len-i-1;j++)   
            {
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        System.out.println("Array After sorting :");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");

        }
        
    }
}
