import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(new Random().nextInt(11));
        }
        System.out.println(array);

        array.sort(null);
        System.out.println(array);
    }

}
