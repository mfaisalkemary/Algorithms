package DoublyLinkedList;

public class DoublyLinkedLins {

    public Node first;
    public Node last;

    public boolean isEmpty(){
        return (first==null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.Data=data;

        if (isEmpty()){
            last=newNode;
        }
        else {
            first.Previous=newNode;
        }
        newNode.Next=first;
        newNode.Previous=null;
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.Data=data;

        if (isEmpty()){
            first=newNode;
        }
        else {
            last.Next = newNode;
            newNode.Previous = last;
        }
        last=newNode;

    }


    public Node deleteFirst(){
        Node temp = first;
        if (first.Next ==null){
            last = null;
        }
        else {
            first.Next.Previous=null;
        }
        first=first.Next;
        return temp;
    }

    public Node deleteLast(){
        Node temp = last;
        if (first.Next==null){
            first=null;
        }
        else {
            last.Previous.Next=null;
        }

        last=last.Previous;
        return temp;
    }

    public boolean insertAfter(int key,int data){
        Node newNode = new Node();
        newNode.Data=data;
        Node current = first;

        while (current.Data!=key){
            current=current.Next;
            if (current==null){
                return false;
            }
        }

        if (current==last){
            last=newNode;
        }else{
            newNode.Next=current.Next;
            current.Next.Previous=newNode;
        }

        current.Next=newNode;
        newNode.Previous=current;

        return true;
    }





}
