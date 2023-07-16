package lesson_3;
import java.util.ArrayList;
import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("Fols", "Dom","123", "Hello Wold", "275", "654"));
        System.out.println(array.toString());
        for (int i = 0; i < array.size(); i++) {
            String element = array.get(i);
            try {
                Integer.parseInt(element);
                array.remove(i);
                i--;
            } catch (NumberFormatException ignored) {
                // TODO: handle exception
            }  
        }
        System.out.println("Список после удаление чисел: " + array.toString());
    }
}
