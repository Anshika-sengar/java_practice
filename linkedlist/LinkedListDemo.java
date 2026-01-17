 package linkedlist;
class LinkedListDemo{
    private int size;
    LinkedListDemo(){
        this.size=0;
    }
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=next;
            size++;
        }
    }
    //Add first
    public void AddFirst(String data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    // Add last
    public void AddLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //print
    public void print(){
        if (head==null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode =head;
        while (currNode != null) {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    //Delete first
    public void DeleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        head =head.next;
    }
    public void DeleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode=head.next;
        while (lastNode.next!=null) {
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
  public int getSize(){
    return size;
  }
    public static void main(String[] args) {
        LinkedListDemo ll =new LinkedListDemo();
        ll.AddFirst("khushi");
        ll.AddFirst("anshika");
        ll.AddFirst("sonali");
        ll.print();
        ll.AddLast("komal");
        ll.print();
        ll.DeleteFirst();
        ll.print();
        ll.DeleteLast();
        ll.print();
        System.out.println(ll.getSize());
    }
}