package algo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort extends Algorithm{

    public static int[] sort(int[]array){
        try {
            int steps=0;
            for (int i=1;i<array.length;i++){
                steps++;
                int temp=0;
                int min = array[i];
                for (int j=i-1;j>=0;j--){
                    steps++;
                    if(min<array[j]){
                        temp=array[j];
                        array[i]=temp;
                        array[j]=min;
                        i--;
                    }


                }

            }

            System.out.println("Number of Steps is : "+steps);
            return array;

        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    public static void main(String[] args) {
        int[]array =createIntArray(10);
        System.out.println("Sorted By Me  "+Arrays.toString(sort(array)));
        sortArrayByJava(array);

    }
}
