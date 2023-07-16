package lesson_3.Lection3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class task {
public static void main(String[] args) {
//     Object o = 1; GetType(o);
//     o = 1.2; GetType(o);
// }

//     static void GetType(Object obj) {
//         System.out.println(obj.getClass().getName());
//     }

// int[] a = new int[]{1, 2,};
// int[] b = new int[3];

// System.arraycopy(a, 0, b, 0, a.length);

// for (int i : a) {
//     System.out.printf("%d", i);
// }

// for (int j : b) {
//     System.out.printf("%d", j);
// }

// ArrayList<String> list = new ArrayList<String>();
// list.add("Павел");
// list.add("Юлек");
// list.add("Матвей");
// list.add("Алена");
// list.add("Кирилл");
// System.out.println(list.toString());
// list.sort(null);
// System.out.println(list.toString());
// System.out.println(list.subList(1, 3));

StringBuilder day = new StringBuilder("28");
StringBuilder month = new StringBuilder("9");
StringBuilder year = new StringBuilder("1990");

StringBuilder[] date = new StringBuilder[]{day, month, year};
ArrayList<StringBuilder> d = Arrays.asList(date);
System.out.println(d);
date[1] = new StringBuilder("09");
System.out.println(d);
    }
}

