package recursion;

public class printAllPermutations {

    //Time complexity O(n!)
    public static void printPremutations(String str,String permutations)
    {
        if(str.length()==0){
            System.out.println(permutations);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);

            printPremutations(newStr, permutations+current);

        }


    }
    public static void main(String[] args) {
        String str = "abc";
        printPremutations(str, "");
    }    
}
