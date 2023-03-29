package homeworkJava;

public class task3 {
    public static void main(String[] args) {

        // Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и
        // на себя без остатка)

        for (int i = 2; i < 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(i);
            }

        }

    }

}
