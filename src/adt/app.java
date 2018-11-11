package adt;

public class app {
   

    public static void main(String [] args){
        Counter myCounter  = new Counter("my counter");
        myCounter.getCurrentValue();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());
    }

}
