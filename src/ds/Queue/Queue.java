package ds.Queue;

public class Queue {
    private int topIndex;
    private int maxSize;
    private int rearIndex;
    private int []queuArray;
    private int elementsNumberInArray;

    public Queue(int Size) {
        this.maxSize = Size;
        this.topIndex=0;
        this.rearIndex=-1;
        this.queuArray=new int[Size];
        this.elementsNumberInArray=0;
    }

    public void insertElement(int Element){
        if(isFull()){
            rearIndex=-1;
        }
        rearIndex++;
        queuArray[rearIndex]=Element;
        elementsNumberInArray++;
    }

    public int removeEmenet(){
        int tempFrontIndex=queuArray[topIndex];
        topIndex++;
        if(topIndex == maxSize){
            topIndex =0;
        }
        rearIndex --;
        return tempFrontIndex;
    }

    public boolean isEmpty(){
        return (rearIndex==-1);

    }

    public boolean isFull(){
        return(rearIndex==maxSize-1);
    }

    public void view(){
        System.out.print("[ ");
        for (int i =0;i<maxSize;i++){
            System.out.print(queuArray[i]+" ");
        }
        System.out.print(" ]");
    }
}
