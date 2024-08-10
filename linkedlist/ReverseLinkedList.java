package linkedlist;

public class ReverseLinkedList {
   
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.printList();
        list.reverseIterative();

        list.printList();


        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
