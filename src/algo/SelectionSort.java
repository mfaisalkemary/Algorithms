package algo;

import java.lang.reflect.Array;
import java.util.Arrays;
// selection sort complixty is o(n(n-(i+1)))
//but since n square is the dominant expression so it is o(n sqaure)
public class SelectionSort extends Algorithm {

    public static int[] sort(int [] array){

        try {
            int steps=0;
            for (int i=0;i<array.length;i++){
                steps++;
                int min=array[i];
                int temp=0;
                for (int j=i+1;j<array.length;j++){
                    steps++;
                    if (array[j]<array[i]){
                        min=array[j];
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }

            }
            System.out.println(steps);
            return array;

        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(createIntArray(10))));

    }
}
