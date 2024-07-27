package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {7,8,1,2,3};
        int len = arr.length;

        for(int i=1;i<len;i++)
        {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = current;
        }

        System.out.println("Array After sorting :");
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");

        }


    }
}
