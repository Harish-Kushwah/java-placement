public class ClearBit {
    public static void main(String[] args) {
        int num = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int ans = num & (~bitMask);
        System.out.println("Ans : " + ans);

    }
}
