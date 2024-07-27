package recursion;

public class print1ToN {
    private static void printN(int n,int t)
    {
        if(n>t){
            return;
        }
        System.out.print(n + " ");
        printN(++n,t);

    }
    public static void main(String[] args) {
        printN(1,15);
    }
}
