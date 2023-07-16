package lesson_3;
import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("Меркурий", "Марс", "Венера", "Меркурий", "Земля",
                "Уран", "Марс", "Юритер", "Сатурн", "Уран", "Нептун","Меркурий", "Юритер"));
        System.out.println(array.toString());
        array.sort(null);
        System.out.println(array.toString());
        int count = 1;
        for (int i = 1; i < array.size(); i++) {
                if(array.get(i)==array.get(i-1)){
                    count++;
            }
            else{
                System.out.println(array.get(i-1)+" "+Integer.toString(count));
                count=1;
            }
        }
        System.out.println(array.get(array.size()-1)+" "+Integer.toString(count));
        
        for (int i = 1; i < array.size(); i++) {
                if(array.get(i)==array.get(i-1)){
                    array.remove(i);
                    i--;
            }
        }   
        System.out.println(array.toString());
    }
}
