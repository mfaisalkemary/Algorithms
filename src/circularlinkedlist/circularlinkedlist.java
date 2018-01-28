package circularlinkedlist;

public class circularlinkedlist {
    Node first;
    Node last;

    public circularlinkedlist() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return (first ==null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data=data;
        if(isEmpty()){
            last=newNode;
        }
        newNode.next=first;
        first=newNode;
    }

    public void insertLast(int data){
        Node newNode1=new Node();
        newNode1.data=data;

        if (isEmpty()){
            first=newNode1;
        }
        else {
            last.next=newNode1;
            last=newNode1;
        }

    }

    /*public void insertLast(int data){

        Node newNode = new Node();
        newNode.data=data;

        if(isEmpty()){
            first = newNode;
        }
        last.next=newNode;
        last = newNode;
    }*/

    public int deleteFirst(){
        int temp = first.data;
        if(first.next==null){
            last=null;
        }

        first=first.next;
        return temp;
    }


    public int deleteLast(){
        int temp = last.data;
        if (first.next==null){
            last=null;
        }
        last=last.next;
        return temp;
    }

    public void Display(){
        while (first !=null){
            first.print();
            first=first.next;
        }
    }

}
