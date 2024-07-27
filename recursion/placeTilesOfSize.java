package recursion;

public class placeTilesOfSize {
    //Q.Place Tiles of size 1xm in a floor of size nxm
    public static int placeTiles(int n,int m)
    {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //tile size 1xm
        //vertically
        int verticalPlacement = placeTiles(n-m, m);

        //horizontal
        int horizontalPlacement = placeTiles(n-1, m);

        return verticalPlacement + horizontalPlacement;
    }
    public static void main(String[] args) {
        int n = 4 ,m = 2;
        System.out.println(placeTiles(n, m));
    }
}
