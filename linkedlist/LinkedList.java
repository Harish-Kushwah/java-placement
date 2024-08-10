package linkedlist;

public class LinkedList {
    Node head = null;
    private int size;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    LinkedList(){
        this.size = 0;
    }

    //add-first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp;
            for(temp=head;temp.next!=null;temp=temp.next);
            temp.next = newNode;
        }
        size++;
    }

    //delete head
    public void deleteHead(){
        if(head!=null){
            head = head.next;
        }
        size--;
    }

    //delete last
    public void deleteLast(){
        //if at least two nodes are present 
        if(head!=null && head.next!=null){
            Node temp;
            //go up to second last and unlink the last node
            for(temp=head; temp.next.next!=null;temp=temp.next);
            temp.next = null; 
            size--;

        }
        //if there is only one node then remove using the head
        if(head.next==null){
            deleteHead();
        }
    }

    //delete at index
    public void delete(int index){
        if(index==0){
            deleteHead();
        }
        else{
            int i =1;
            Node temp = head;
            while(i!=index && temp!=null){
                temp = temp.next;
                i++;
            }
            if(i==index)
            {
                if(temp==null){
                    deleteLast();
                }
                else{
                 temp.next = temp.next.next;
                size--;

                }
            }
        }
    }
    public int getSize(){
        return this.size;
    }
    public void printList(){
        System.out.println("Size :"+getSize());
        for(Node temp=head;temp!=null; temp=temp.next){
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }

    public void reverseIterative(){
        if(head==null || head.next ==null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public Node getNthLastNode(int n){
        int len = getSize()-n;
        if(len>=0){
            int i =0;
            Node temp;
            for(temp=head;temp!=null && i<len;temp=temp.next,i++);
            return temp;
        }
        else{
            return null;
        }
    }
    public void removeNthFromLast(int n){
        int indexFromStart = getSize()-n;
        delete(indexFromStart);
    }
    public boolean isPalindrome(){
        int n = getSize();
        Node temp =head;
        for(int i=1;i<=n/2 && temp!=null;i++){
            if(!temp.data.equals(getNthLastNode(i).data)){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
    public boolean hasCycle(){
        if(head == null){
            return false;
        }
        Node turtle = head; // slow
        Node hare = head; //fast
        while (hare!=null && hare.next!=null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if(hare==turtle){
                return true;
            }

        }
        return false;


    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.printList();

        list.addFirst("a");
        list.addFirst("d");
        list.addFirst("e");
        list.printList();

        list.deleteHead();
        list.printList();

        list.addLast("FY");
        list.addLast("MCS");

        list.printList();
        
        list.delete(0);
        
        list.printList();

        Node ans = list.getNthLastNode(1);
        System.out.println(ans.data);

        list.removeNthFromLast(3);
        list.printList();
        System.out.println(list.isPalindrome());
        System.out.println(list.hasCycle());

    }
}
