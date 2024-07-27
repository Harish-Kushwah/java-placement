package recursion;

public class RemoveDuplicates {

    public static String unique="";
    public static void removeDuplicates(String str,int n,int i)
    {
        if(i==n-1){
            System.out.println(unique);
            return;
        }

        char currentChar = str.charAt(i);
        if(!unique.contains(Character.toString(currentChar))){
            unique+=currentChar;
        }   
        removeDuplicates(str, n, ++i);
    }
    public static void main(String[] args) {
        String str = "abbccdaaahdjf";
        int len = str.length();
        removeDuplicates(str, len, 0);
    }
}
