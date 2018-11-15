package algo;

import java.util.Arrays;
import java.util.Random;

public class Algorithm {
    public static int[] createIntArray(int length) {

        try {
            Random random = new Random();

            int[] a = new int[length];


            for (int i = 0; i < a.length; i++) {
                //a= new int[]{random.nextInt() / i};
                a[i] = random.nextInt(100);
            }

            //Arrays.sort(a);

            System.out.println(Arrays.toString(a) + "\n");

            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void sortArrayByJava(int[]array){
        try {
            Arrays.sort(array);
            System.out.println("Sorted By Java"+Arrays.toString(array));
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}



