// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке 
// и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. 
//    Одно или два числа должны быть отрицательными.
package lesson_4.HomeWork4;

import java.util.ArrayDeque;
import java.util.Deque;

public class taskHW1_1 {
    public static void main(String[] args) {
        // Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке 
        // и каждый из их узлов содержит одну цифру.
        Deque<Integer> dqOne = new ArrayDeque<>();
        dqOne.add(3);
        dqOne.add(2);
        dqOne.add(1);
        Deque<Integer> dqTwo = new ArrayDeque<>();
        dqTwo.add(5);
        dqTwo.add(4);
        dqTwo.add(3);
        System.out.println(dqOne);
        System.out.println(dqTwo);

        Deque<Integer> result = СompositionDeque(dqOne, dqTwo);
        System.out.println("Результат умножения 2-х Deque: " + result);
        
        dqOne.add(3);
        dqOne.add(2);
        dqOne.add(1);

        dqTwo.add(5);
        dqTwo.add(4);
        dqTwo.add(-2);
        System.out.println(dqOne);
        System.out.println(dqTwo);
        Deque<Integer> sumResult = SumDeque(dqOne, dqTwo);
        System.out.println("Сумма двух Deque: " +sumResult);
    }

    // 2) Сложите два числа и верните сумму в виде связанного списка. 
    //Одно или два числа должны быть отрицательными.
    public static Deque <Integer>SumDeque(Deque<Integer> dqOne, Deque<Integer> dqTwo) {
        Deque<Integer> result = new ArrayDeque<>();
        int sum = 0;
        String sumOne = "";
        String sumTwo = ""; 
        while (!dqOne.isEmpty()||!dqTwo.isEmpty()) {
            if(!dqOne.isEmpty()){
                sumOne += dqOne.removeLast();
            }
            if (!dqTwo.isEmpty()) {
                sumTwo += dqTwo.removeLast();
            }
        }
        int oneNum = Integer.parseInt(sumOne);
        int twoNum = Integer.parseInt(sumTwo);
        sum = oneNum + twoNum;
        int absol = sum;
        while (sum!=0){
            result.addFirst(sum%10);
            sum/=10;
        }
        return result;
    }

    // 1) Умножьте два числа и верните произведение в виде связанного списка.
    public static Deque<Integer> СompositionDeque (Deque<Integer> dqOne, Deque<Integer> dqTwo) {
        Deque<Integer> result = new ArrayDeque<>();
        int composition = 0;
        String sumOne = "";
        String sumTwo = ""; 
        while (!dqOne.isEmpty()||!dqTwo.isEmpty()) {
            if(!dqOne.isEmpty()){
                sumOne += dqOne.removeLast();
            }
            if (!dqTwo.isEmpty()) {
                sumTwo += dqTwo.removeLast();
            }
        }
        int oneNum = Integer.parseInt(sumOne);
        int twoNum = Integer.parseInt(sumTwo);
        composition = oneNum * twoNum;
        
        while (composition!=0){
            result.addFirst(composition%10);
            composition/=10;
        }
        return result;
    }
}
