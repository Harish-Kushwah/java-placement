public class SetBit {
    public static void main(String[] args) {
        int num = 5; 
        int pos = 1;
        int bitMask = 1<<pos;
        int ans = bitMask|num;
        System.out.println("After setting the bit new number : "+ ans);
    }
}
