package HW_2;// Так и не понял до конца что имелось в виду (что делать пытались).

//try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
//} catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
//}

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double[] catchedRes1 = new double[8];
            int[] arr = new int[catchedRes1.length];
            for (int i = 0; i < arr.length; i++) {
                catchedRes1[i] = (double) (arr[i] / d);
            }
            System.out.println("catchedRes1 = " + Arrays.toString(catchedRes1));
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}