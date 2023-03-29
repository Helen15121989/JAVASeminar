package homeworkJava;

import java.util.Scanner;

// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double number1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double number2 = scanner.nextDouble();
        System.out.println("Введите какое действие хотите выполнить:('+','-','*','/') ");
        char operation = scanner.next().charAt(0);
        scanner.close();
        if (operation == '/' && number2 == 0.0)
            System.out.println("На ноль делить нельзя! Введите верное второе число! ");
        {
            if (operation == '+') {
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
            } else if (operation == '-') {
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            } else if (operation == '*') {
                System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
            } else if (operation == '/') {
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            } else {
                System.out.println("Введен не верный оператор!");
            }

        }
    }

}
