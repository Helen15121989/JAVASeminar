package homeworkJava5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class phone {

    Map<String, List<String>> phonebook = new HashMap<>();

    void add(String name, String phone) { // добавление номера и имени

        if (!phonebook.containsKey(name)) {
            phonebook.put(name, new ArrayList<String>());
        }
        phonebook.get(name).add(phone);

    }

    void getname(String name) { // поиск по имени
        if (phonebook.containsKey(name))
            System.out.println(phonebook.get(name));
        else {
            System.out.println("Имя не найдено! ");
        }

    }

    void printContacts() { // телефонная книга
        System.out.println("Телефонная книга: " + phonebook);

    }

    void delete(String name) { // удаление контакта
        phonebook.remove(name);
        System.out.println("Выбранный контакт удален!");

    }

}
