package recursion;

public class printFactorial {
    public static void printFact(int n,int fact)
    {
        if(n==1 || n==0){
            System.out.println("Factorial :" + fact);
            return ;
        }
        fact *=n;
        printFact(--n,fact);

    }
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(--n);

    }
    public static void main(String[] args) {
        printFact(1,1);
        System.out.println(fact(5));
    }
}
