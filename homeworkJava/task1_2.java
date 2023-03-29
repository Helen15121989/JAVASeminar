package homeworkJava;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(triangularNumber(n));
        System.out.println(factorial(n));

    }

    // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
    public static int triangularNumber(int a) {
        return (a * (a + 1)) / 2;

    }

    // Вычислить n! (произведение чисел от 1 до n)
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;

        }
        return result;

    }

}
