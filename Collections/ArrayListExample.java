package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        //List of Integers 
        ArrayList<Integer> list = new ArrayList<Integer>();

        //List of Strings
        ArrayList<String> stringList = new ArrayList<>();

        //add the numbers into the list
        list.add(1);
        list.add(2);
        list.add(3);

        //access the elements
        System.out.println(list.get(0));

        //set the value in list
        list.set(0, 10);
        System.out.println(list);

        //remove the element from the list
        list.remove(1);

        //find out the size
        int size = list.size();

        //traverse the list
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }

        //sort the list
        Collections.sort(list);

        System.out.println(list);

        //sort the list in reverse order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
}
