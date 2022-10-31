public class Main {
    public static void main(String[] args) {
        System.out.println("--");
        System.out.println("Задача 1");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Вывел число " + i);
        }
        System.out.println("--");
        System.out.println("Задача 2");

        for (int i = 10; i >= 1; i-- ) {
            System.out.println("Отсчет " + i);

        }

        System.out.println("--");
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println("Вывожу число " + i);
            }
        }

        System.out.println("--");
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Число " + i);
        }

        System.out.println("--");
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является вискосным");
        }

        System.out.println("--");
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i +7) {
            System.out.print(i + " ");
        }

        System.out.println("--");
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }

        System.out.println("--");
        System.out.println("Задача 8, 9");


        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }


    }
}