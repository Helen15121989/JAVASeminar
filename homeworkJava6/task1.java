package homeworkJava6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task1 {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
     * методы. Реализовать в java.
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя критерий (или
     * критерии) фильтрации и выведет ноутбуки,
     * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * Далее нужно запросить минимальные значения для указанных критериев -
     * сохранить параметры фильтрации можно также в Map.
     * Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
     * условиям.
     */

    public static void main(String[] args) {
        Set<Computer> set = new HashSet<>();
        Map<String, String> filtr = new HashMap<>();
        catalog(set);
        menu(filtr);
        show(filtr, set);

    }

    static void catalog(Set<Computer> set) {

        Computer computer = new Computer("ASUS Vivobook Pro 16 OLED ", 4, 512, "Windows 10", "зеленый");
        Computer computer1 = new Computer("Apple MacBook Air 13", 8, 256, "MacOS", "черный");
        Computer computer2 = new Computer("Xiaomi RedmiBook 14 II", 16, 512, "Windows 10", "белый");
        Computer computer3 = new Computer("HP Spectre X360", 16, 512, "Windows 10", "серый");
        Computer computer4 = new Computer("Lenovo ThinkPad X1 Carbon Gen 9", 16, 512, "Windows 10", "черный");
        Computer computer5 = new Computer("HONOR MagicBook 15", 16, 512, "Windows 10", "белый");
        Computer computer6 = new Computer("ASUS Zenbook 14", 16, 1024, "Windows 10", "серый");
        Computer computer7 = new Computer("Manjaro Linux", 16, 512, "Linux", "белый");

        set.add(computer);
        set.add(computer1);
        set.add(computer2);
        set.add(computer3);
        set.add(computer4);
        set.add(computer5);
        set.add(computer6);
        set.add(computer7);
    }

    static void menu (Map <String, String> filtr){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){

        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - Модель\n" +
                "2 - ОЗУ\n" +
                "3 - Объем ЖД\n" +
                "4 - Операционная система\n" +
                "5 - Цвет\n" +
                "6 - Готов посмотреть варианты");
      
        Integer choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
               
                System.out.println("Введите производителя: ");
                String model = scanner.nextLine();
                filtr.put(model, "ASUS Vivobook Pro 16 OLED ");
                filtr.put(model, "Apple MacBook Air 13");
                filtr.put(model, "Xiaomi RedmiBook 14 II");
                filtr.put(model, "HP Spectre X360");
                filtr.put(model, "Lenovo ThinkPad X1 Carbon Gen 9");
                filtr.put(model, "HONOR MagicBook 15");
                filtr.put(model, "ASUS Zenbook 14");
                filtr.put(model, "Manjaro Linux");
              
                break;
            case 2:
               
                System.out.println("Введите минимальную оперативную память: ");
                String ram = scanner.nextLine();
                filtr.put(ram, "4");
                filtr.put(ram, "8");
                filtr.put(ram, "16");
                break;
            case 3:
               
                System.out.println("Введите минимальный объем ЖД: ");
                String disk = scanner.nextLine();
                filtr.put(disk, "256");
                filtr.put(disk, "512");
                filtr.put(disk, "1024");
                break;
            case 4:
               
                System.out.println("Введите название операционной системы: ");
                String os = scanner.nextLine();
                filtr.put(os, "Windows 10");
                filtr.put(os, "Linux");
                filtr.put(os, "MacOS");
                break;
            case 5:
                
                System.out.println("Какой хотите цвет: ");
                String color = scanner.nextLine();
                filtr.put(color, "зеленый");
                filtr.put(color, "черный");
                filtr.put(color, "белый");
                filtr.put(color, "серый");
                break;
            case 6:
            flag = false;
            System.out.println("Подходящие варианты: ");
            break;
                

            default:
                break;
        }
    }
    scanner.close();
     

    }

    static void show(Map<String, String> filtr, Set<Computer> set) {
 
        for (Computer comp : set) {
            boolean check = true;
            for (Map.Entry<String, String> entry : filtr.entrySet()) {
                if (entry.getKey().equals("model")) {
                    if (!comp.getModel().equalsIgnoreCase(entry.getValue())) {
                        check = false;
                    }
                }

                if (entry.getKey().equals("ram")) {
                    if (!(comp.getRam()>= Integer.parseInt(entry.getValue())))  {
                        check = false;
                    }
                }
                if (entry.getKey().equals("disk")) {
                    if (!(comp.getDisk() >= Integer.parseInt(entry.getValue()))) {
                        check = false;
                    }
                }
                if (entry.getKey().equals("os")) {
                    if (!comp.getOs().equalsIgnoreCase(entry.getValue())){
                        check = false;
                    }
                }
                if (entry.getKey().equals("color")) {
                    if (!comp.getColor().equalsIgnoreCase(entry.getValue())) {
                        check = false;
                    }
                }

            }
            if (check) {
                System.out.println(comp);
                
            }

        }
    }

}
