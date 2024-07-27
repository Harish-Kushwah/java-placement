package recursion;

import java.util.HashSet;

public class printAllSubsequences {

    //total subseq = 2^n  ... n=length of string , time complexity = O(2^n)
    public static void subSequences(String str,int i,String newString)
    {
        if(i == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(i);
        //to be 
        subSequences(str, i+1, newString+currChar);

        //not to be
        subSequences(str, i+1, newString);


    }

    public static void uniqueSubSequences(String str,int i,String newString,HashSet<String> set)
    {   
        if(i==str.length()){
            if(!set.contains(newString)){
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        char currChar = str.charAt(i);
        uniqueSubSequences(str, i+1,  newString + currChar,set);
        uniqueSubSequences(str, i+1, newString,set);
    }
    public static void main(String[] args) {
        String str = "aab";
        uniqueSubSequences(str, 0, "",new HashSet<>());
      
    }
}
