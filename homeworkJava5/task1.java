package homeworkJava5;

public class task1 {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
    // человек может иметь несколько телефонов.
    public static void main(String[] args) {

        phone phone = new phone();
        phone.add("Анна", "45678");
        phone.add("Ольга", "56758");
        phone.add("Сергей", "45678");
        phone.add("Петр", "98654");
        phone.add("Петр", "17653");
        phone.add("Анна", "97654");
        phone.printContacts();
        phone.getname("Анна");
        phone.delete("Сергей");
        phone.printContacts();

    }
}
