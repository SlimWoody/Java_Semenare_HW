import java.util.Scanner;

/**
 * taskHW1_3
 * 3. Реализовать простой калькулятор
 */

public class taskHW1_3 {
    public static void main(String[] args) {
        double numA;
        double numB;
        double result;
        char oper;
        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите первое число: ");
        numA = in.nextDouble();
        System.out.print("\nВведите второе число: ");
        numB = in.nextDouble();
        System.out.print("\nВведите математический оператор (+, -, *, /): ");
        oper = in.next().charAt(0);
        switch (oper) {
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
                System.out.printf("Введено неверное значение");
                return;
        }
        System.out.printf("\n" + numA + " " + oper + " " + numB + " = " + result);
    }
}
