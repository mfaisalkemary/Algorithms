package algo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch extends Algorithm{


    public static int ordinarysearch(int [] a,int x){

        try {

            for (int i=0;i<a.length;i++){
                if(a[i]==x){
                    return i;
                }

            }
            return -1;



        } catch (Exception e) {
            e.printStackTrace();
            return 0;

        }


    }

    public static int binarySearch(int []a,int item){
        try {

            int s=0;
            int e=a.length-1;
            int m;
            int steps=0;
            while (e>=s){
                steps++;
                m=(s+e)/2;
                if(item>a[m]){
                    s=m+1;
                }
                else if(item<a[m]){
                    e=m-1;
                }
                else {
                    System.out.println(steps);
                    return m;}
            }


            return -1;

        }
        catch (Exception e){
            e.printStackTrace();
            return -1;
        }



    }

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,15},15));

    }


}
