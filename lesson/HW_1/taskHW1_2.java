/**
 * taskHW1_2
 * 2. Вывести все простые числа от 1 до 1000
 */

public class taskHW1_2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i % 1 == 0 && i % i == 0 && i % 2 != 0) {
                System.out.printf("%s ", i);
            }
        }

    }
}
