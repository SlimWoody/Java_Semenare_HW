// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
package lesson_3.HW3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class taskHW2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        arrNum.add(12);
        arrNum.add(21);
        arrNum.add(1);
        arrNum.add(77);
        arrNum.add(11);
        arrNum.add(2);
        arrNum.add(87);
        arrNum.add(64);
        arrNum.add(34);

        System.out.println(arrNum.toString());

        RemovingEvenNumbers(arrNum);

        for (int i = 0; i < arrNum.size(); i++) {
            if(arrNum.get(i)% 2 == 0){
                arrNum.remove(i);
            }
        }
        

        System.out.println(arrNum.toString());

        int min = Collections.min(arrNum);
        int max = Collections.max(arrNum);
        arrNum.sort(null);
        
        System.out.println(arrNum);
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        AverageNum(arrNum);

        MinAveregeMaxCicle(arrNum);
    }

    private static void RemovingEvenNumbers(ArrayList<Integer> arrNum) {
        for (int i = 0; i < arrNum.size(); i++) {
            if(arrNum.get(i)%2==0){
                arrNum.remove(i);
            }
        }
    }

    private static void MinAveregeMaxCicle(ArrayList<Integer> arrNum) {
        int min = arrNum.get(0);
        int max = arrNum.get(0);
        int averege = arrNum.get(0);
        for (Integer i : arrNum) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        AverageNum(arrNum);
    }

    private static void AverageNum(ArrayList<Integer> arrNum) {
        int a = arrNum.size() / 2;
        int average = arrNum.get(a);
        System.out.println("Среднее число: " + average);
    }

}
