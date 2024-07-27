package sorting;

public class selectionSort {
    public static int getMinimumNumIndex(int arr[],int len,int start)
    {
        int min = arr[start];
        int index = start;
        for(int i=start;i<len;i++)
        {
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return index;

    }
   
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        int len = arr.length;

        //selection sort
        for(int i=0;i<len-1;i++)
        {
            int min = getMinimumNumIndex(arr,len,i);
            int t  = arr[min]; 
            arr[min] = arr[i];
            arr[i] = t;
        }

        System.out.println("Array After sorting :");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");

        }
    }
}
