package lesson_1;

import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        int n = 5;
        String a = "Hello";
        var x = 'f';
        boolean flag = true;


        // while (n<20) {
        //     System.out.println(n);
        //     n+=5;
        // }
        
        int j = 7;
        do {
            System.out.println(j);
            j--;
        } while (j>0);
        int[] array = {1, 2, 3, 4};
        int[] number = new int[6];

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                number[i] = array[i];
                System.out.println(number[i]);
            }
        }

        Scanner in  = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
    }
}