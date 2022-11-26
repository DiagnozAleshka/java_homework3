import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;
// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(6);
        list1.add(12);
        list1.add(7);
        System.out.println(list1);
        int maxim = max(list1);
        System.out.println("max number = " + maxim);
        int minim = min(list1);
        System.out.println("min number = " + minim);

        int summa = 0;
        for (int element : list1) {
            summa += element;
            
        }
        float average = summa/list1.size();
        System.out.println("среднее фрифмитическое = " + average);
    }
}
