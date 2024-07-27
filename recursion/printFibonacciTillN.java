package recursion;

public class printFibonacciTillN {
    public static void printFib(int a, int b, int n)
    {
        if(n==2){
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(b, c, --n);
    }
    public static void main(String[] args) {
        int a = 0 , b = 1 ,n = 5;
        System.out.print(a + " ");
        System.out.print(b + " ");
        printFib(a,b,n);
    }
}
