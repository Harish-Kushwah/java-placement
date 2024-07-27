package recursion;

public class printNto1 {

    public static void printN(int n)
    {
        if(n==0){
            return;
        }
        System.out.print(n +" ");
        printN(--n);

    }
    public static void main(String[] args) {
        printN(5);
    }
}
