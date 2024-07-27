package recursion;

public class countTotalPathsInMaze {
    //count total paths in maze to move from (0,0) to (n,m)

    public static int count(int i,int j,int n,int m)
    {
        if(i==n || j==m){
            return 0;
        }

        if(i==n-1 && j==m-1){
            return 1;
        }
        //move downwards
        int downPaths = count(i+1,j,n,m);

        //move right
        int rightPaths = count(i, j+1, n, m);

        return downPaths + rightPaths;

    }
    public static void main(String[] args) {
        int n=3,m=4;
        System.out.println(count(0, 0, n, m));
    }   
}
