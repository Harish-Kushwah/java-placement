package recursion;

public class printSumOfNNaturalNum {
    //1+2+3..
    public static void sum(int n,int ans)
    {
        if(n==0){
            System.out.println("Sum :"+ans);
            return;
        }
        ans+=n;
        sum(--n,ans);
    }

    public static int sum(int n)
    {
        if(n==0){
            return 0;
        }
        return  n +  sum(--n); 
    
    }
    public static void main(String[] args) {
        sum(2,0);
        System.out.println("Sum :" + sum(2));
    }
}
