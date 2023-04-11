package homeworkJava4;

import java.util.LinkedList;
import java.util.ListIterator;

public class task3 {
    // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
    // Используйте итератор.
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(10);
        ll.add(76);
        ll.add(87);
        System.out.println("Наш список:" + ll);
        System.out.println("Сумма равна: " + summa(ll));
    }

    
    static int summa(LinkedList<Integer> array){
        int sum = 0;
        ListIterator<Integer> iterator = array.listIterator(0);
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}

