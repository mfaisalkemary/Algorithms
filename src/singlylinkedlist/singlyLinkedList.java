package singlylinkedlist;

public class singlyLinkedList {
    private Node first;

    public singlyLinkedList() {

    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data){
        Node newnode = new Node();
        newnode.next=first;
        newnode.data=data;
        first = newnode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first=first.next;
        return temp;
    }


    public void displayList(){

        while (first !=null){
            first.print();
            first=first.next;
        }

    }

    public void insertLast(int data){
        Node currentNode =first;
        while (currentNode.next!=null){
            currentNode=currentNode.next;
        }
        Node newNode=new Node();
        newNode.data=data;
        currentNode.next=newNode;
    }
}
