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


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.printList();

        list.addFirst("Harish");
        list.addFirst("Kushwah");
        list.printList();

        list.deleteHead();
        list.printList();

        list.addLast("FY");
        list.addLast("MCS");

        list.printList();
        
        list.delete(0);
        
        list.printList();
    }
}
