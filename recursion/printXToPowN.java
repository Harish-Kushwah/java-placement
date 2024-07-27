package recursion;

public class printXToPowN {
    public static int pow(int x,int n)
    {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*pow(x,--n);
    }
    public static int pow1(int x,int n)
    {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int ans = pow1(x,n/2);
        int ansForEvenNum = ans*ans;
        if(n%2==0){
            return ansForEvenNum;
        }
        else{
            return x*ansForEvenNum;
        }
       
    }
    public static void main(String[] args) {
        System.out.println(pow1(2,15));
    }
}
