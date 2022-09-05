public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        // Задание 2
        System.out.println("Задание 2");
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        // Задание 3
        System.out.println("Задание 3");
        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }

        // Задание 4
        System.out.println("Задание 4");
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        // Задание 5
        System.out.println("Задание 5");
        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }

        // Задание 6
        System.out.println("Задание 6");
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        // Задание 7
        System.out.println("Задание 7");
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }

        {// Задание 8
            System.out.println("Задание 8");
            int savings = 29_000;
            int total = 0;

            for (int h = 1; h <= 12; h++) {
                total = total + savings;
                System.out.println("Месяц " + h + ", сумма накоплений равна " + total + " рублей");
            }
        }

        // Задание 9
        System.out.println("Задание 9");
        int savings = 29_000;
        int total = 0;

        for (int h = 1; h <= 12; h++) {
            total = total + total/100;
            total = total + savings;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total + " рублей");
        }
    }
}