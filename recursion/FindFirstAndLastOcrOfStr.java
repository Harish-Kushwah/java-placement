package recursion;

public class FindFirstAndLastOcrOfStr {

    public static void printFAndLast(String str,int i)
    {
        if(i==str.length()){
            return;
        }
        if(i==0 || i==str.length()-1){
            System.out.print(str.charAt(i)+" ");
        }
        printFAndLast(str, ++i);
    }
    public static void main(String[] args) {
        String str = "ab";
        printFAndLast(str, 0);
    }
}
