package singlylinkedlist;

public class App {
    public static void main(String[] args) {
        singlyLinkedList myList=new singlyLinkedList();
        myList.insertFirst(1);
        myList.insertFirst(2);
        myList.insertFirst(3);
        myList.insertFirst(4);
        myList.insertFirst(5);
        myList.insertLast(100);
        myList.insertFirst(6);
        myList.deleteFirst();
        myList.displayList();
    }
}
