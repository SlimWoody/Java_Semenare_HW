package lesson_1;

import java.util.Scanner;

/**
 * task_2
 */
public class task_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numA = in.nextInt();
        int numB = in.nextInt();
        int numC = in.nextInt();

        int[] array = { numA, numB, numC };
        int min = array[0];
        int max = array[0];
        int superfluous = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j] > min && array[j] < max) {
                    superfluous = array[j];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(superfluous);

    }
}
