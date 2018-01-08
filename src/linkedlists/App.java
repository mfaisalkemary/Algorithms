package linkedlists;

public class App {

    public static int getNodeLength(Node nodeA){
        int length =0;

    while (nodeA !=null){
        length++;
        nodeA = nodeA.next;
    }
        return length;
    }

    public static void main(String[] args) {
        Node A =new Node();
        A.data=1;

        Node B =new Node();
        A.data=2;

        Node C =new Node();
        A.data=3;

        Node D =new Node();
        A.data=4;


        A.next=B;
        B.next=C;
        C.next=D;

        System.out.println(getNodeLength(A));
        System.out.println(getNodeLength(B));
        System.out.println(getNodeLength(C));
        System.out.println(getNodeLength(D));


    }

}
