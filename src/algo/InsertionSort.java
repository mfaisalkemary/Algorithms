package algo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort extends Algorithm{

    public static int[] sortWrong(int[]array){
        try {
            int [] array1;
            int steps=0;
            for (int i=1;i<array.length;i++){
                steps++;
                int temp=0;
                int min = array[i];
                int t =i;
                for (int j=t-1;j>=0;j--){
                    steps++;
                    if(min<array[j]){
                        temp=array[j];
                        array[t]=temp;
                        array[j]=min;
                        t--;
                    }


                }

            }

            System.out.println("Number of Steps is : "+steps+"\n");
            array1=array;
            return array1;

        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public static int[] sortByInstructor(int[]array){
        try {

            for (int i=1;i<array.length;i++){
                int element=array[i];
                int j =i-1;
                while (j>=0 && array[j]>element){
                    array[j+1]=array[j];
                    j--;
                }
                array[j+1]=element;

            }

            return array;

        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public static int[] insertionSort(int [] array){
        try {
            int steps =0;

            for (int i=1;i<array.length;i++){
                steps++;
                int element = array[i];
                for (int j=i-1;j>=0;j--){
                    steps++;
                    if (array[j]>element){
                        //element=array[j];
                        array[j+1]=array[j];
                        array[j]=element;
                        element=array[j];
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
        int[]array =createIntArray(10);

        //System.out.println("Sorted By Me  "+Arrays.toString(sort(array)));

      //  System.out.println("Sorted By Instructor  "+Arrays.toString(sortByInstructor(array)));

       // sortArrayByJava(array);
        System.out.println("Sorted By me  "+Arrays.toString(insertionSort(array)));


    }
}
