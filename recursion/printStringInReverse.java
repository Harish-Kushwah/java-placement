package recursion;

public class printStringInReverse {
    public static void reverse(String str,int i){
   
        if(i>str.length()-2){
            return ;
        }
        reverse(str, ++i);
        System.out.print(str.charAt(i));
       

    }
    public static void reverse1(String str,int i){
        if(i<0){
            return ;
        }
        System.out.print(str.charAt(i));
        reverse1(str, --i);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverse1(str, str.length()-1);
    }
}
