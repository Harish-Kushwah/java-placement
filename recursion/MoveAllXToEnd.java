package recursion;

public class MoveAllXToEnd {

    private static String strX ="";
    private static String nonStrX ="";
    public static void moveXToEnd(String str,int len,int i)
    {
        if(i==len){
            System.out.println(nonStrX+strX);
            strX=nonStrX="";
            return;
        }
        char current = str.charAt(i);
        if(current=='x'){
            strX+=current;
        }
        else{
            nonStrX+=current;
        }
        moveXToEnd(str, len, ++i);
    }
    public static void main(String[] args) {
        String str = "axbcxsxd";
        int len = str.length();
        moveXToEnd(str,len,0);
        moveXToEnd(str,len,0);
    }
}
