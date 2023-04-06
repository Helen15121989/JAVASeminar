package homeworkJava3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class task1 {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа.
    public static void main(String[] args) {
        deletу(getRandomList());

    }

    public static List<Integer> getRandomList() {
        Random random = new Random();
        int size = 10;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(20));
        }
        System.out.println("Список: " + list.toString());
        return list;
    }

    public static List<Integer> deletу(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println("Отсортированный список: " + list.toString());
        return list;
    }
}
