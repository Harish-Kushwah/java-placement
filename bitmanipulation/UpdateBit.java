import java.util.Scanner;

public class UpdateBit
{
    public static int setBit(int num,int pos)
    {
        //1010 | 0100 => 1110
        return num | (1<<pos);
    }

    public static int clearBit(int num , int pos)
    {
        //1010 &(1101) => 1001
        return num & ~(1<<pos);
    }
    public static void main(String[] args) {
        int num = 5;
        int pos = 1;

        System.out.println("Enter 1 for update and 0 for clear");
        int input = new Scanner(System.in).nextInt();
        if(input==1){
            System.out.println("After set bit :" + setBit(num, pos));
        }
        else{
            System.out.println("After clear bit :" + clearBit(num, pos));

        }


    }
}