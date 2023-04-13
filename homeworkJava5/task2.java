package homeworkJava5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;

public class task2 {
    /*
     * Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова,
     * Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков,
     * Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
     * Мария Рыкова, Марина Лугова, Анна Владимирова
     * Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и
     * выведет повторяющиеся имена с количеством повторений.
     * Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
     */
    public static void main(String[] args) {
        String people = "Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков," +
                "Павел Чернов,Петр Чернышов,Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова," +
                "Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов";
        String[] array = people.split(",");

        HashMap<String, Integer> names = new HashMap<String, Integer>();
        TreeMap<Integer, List<String>> sorted = new TreeMap<>(Comparator.reverseOrder());

        for (int i = 0; i < array.length; ++i) {
            String item = array[i].split(" ")[0];

            if (names.containsKey(item))
                names.put(item, names.get(item) + 1);
            else
                names.put(item, 1);
        }
        for (var item : names.entrySet()) {
            if (sorted.containsKey(item.getValue())) {
                List<String> list = sorted.get(item.getValue());
                list.add(item.getKey());
            } else {
                List<String> list = new ArrayList<String>();
                list.add(item.getKey());
                sorted.put(item.getValue(), list);
            }
        }
        System.out.println(sorted);

    }
}
