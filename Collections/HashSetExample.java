package Collections;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        // HashSet stores the unique elements of the array
        //Write a program to find unique element from the array
        
        //Use the set for storing the unique elements
        Integer[] arr = new Integer[]{1,2,1,2,2,4,3,4,5};

        HashSet<Integer> set = new HashSet<Integer>();
        for(Integer num:arr){
            set.add(num);
        }

        // print the unique elements
        for(Integer num:set){
            System.out.print(num +" ");
        }
    }
}
