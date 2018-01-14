package ds.stack;

public class Stack {

    private int maxSize;
    private char[] stackChar;
    private int topIndex=-1;

    public Stack(int size) {
this.maxSize=size;
stackChar = new char[size];

    }

    public void push(char item){
topIndex++;
stackChar[topIndex]=item;
    }

    public char pop(){
int tempTop = topIndex;
topIndex --;
return stackChar[tempTop];
    }

public boolean isEmpty(){
        return (topIndex==-1);
}

public boolean isFull(){
return (maxSize==topIndex-1);
}

}
