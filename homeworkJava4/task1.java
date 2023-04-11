package homeworkJava4;

import java.util.LinkedList;

public class task1 {
    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернёет «перевёрнутый» список.
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(7);
        ll.add(15);
        ll.add(48);
        ll.add(87);
        System.out.println("Наш список: " + ll);
        ll = reverseLinkedList(ll);
        System.out.print("Перевернуттый список: " + ll);

    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
            llist.set(i, llist.get(llist.size() - i - 1));
            llist.set(llist.size() - i - 1, temp);
        }
 
       
        return llist;
    }
}


