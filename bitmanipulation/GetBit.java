public class GetBit{
    public static void main(String[] args) {
        int num = 5; //1010
        int pos = 2; //find the 2nd bit 
        int bitMask = 1<<pos;
        if((bitMask & num)==0){
            System.out.println("The bit was zero");
        }
        else{
            System.out.println("The bit was one");
        }
    }
}