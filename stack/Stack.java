package stack;
import java.util.*;
public class Stack
{
    int top=-1;
    ArrayList<Integer> arr = new ArrayList<>();

    public void push(int num){
        
        arr.add(++top, num);
    }
    public int pop(){
        if(!isEmpty()){
            return arr.get(top--);
        }
        return -1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(3);
        stk.push(4);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

    }
}