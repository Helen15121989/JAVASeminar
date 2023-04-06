package homeworkJava3;

import java.util.ArrayList;
import java.util.Collections;

public class task2 {
     // Задан целочисленный список ArrayList. Найти минимальное,
    // максимальное и среднее арифметическое из этого списка. Collections.max()
   
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add (7);
        list.add (9);
        list.add (56);
        list.add (43);
        list.add (25);
        list.add (75);
        int count = list.size();
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        double result = sum / count;
        
        
        System.out.println(list);
        System.out.println("Минимальное значение: " + Collections.min (list));
        System.out.println("Максиальное значение: " + Collections.max (list));
        System.out.print("Cреднее арифметическое чисел равно: " + result);

       
        
    }
        
    }

    
   
