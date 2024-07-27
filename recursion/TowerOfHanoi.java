package recursion;

public class TowerOfHanoi {

    //Time complexity = O(2^n-1) = O(2^n)
    public static void towerOfHanoi(int n,String src,String helper,String dest)
    {
        if(n==1){
            System.out.println("Transfer disk " + n + " from "+src +" -> "+dest);
            return;
        }
        //src->helper
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer disk " + n + " from "+src +" -> "+dest);

        //helper -> dest
        towerOfHanoi(n-1,helper,src,dest);

    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n,"SOURCE","HELPER","DESTINATION");

    }
}
