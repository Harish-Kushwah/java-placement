package recursion;

public class waysToInviteNPeople {
    //Find the number of ways in which you can invite n people to your party,single or in pairs
    
    public static int totalWays(int n)
    {
        if(n<=1){
            return 1;
        }
        //single 
        int single = totalWays(n-1);

        //pairs
        int pairs = (n-1)*totalWays(n-2);

        return single + pairs;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalWays(n));
    }
}
