/**
 * taskHW1_1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */
import java.util.Scanner;

public class taskHW1_1 {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.println(triangularNumber(num));

    
    }

    public static int triangularNumber(int n){
        return (n * (n + 1)) / 2;
    }
}
