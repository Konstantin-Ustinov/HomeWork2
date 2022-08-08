package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1((byte) 1);
        System.out.println("Задание 2");
        task2((byte) 1, (short) 2016);
        System.out.println("Задание 3");
        task3(2404);
        System.out.println("Задание 4");
        task4(95);
        System.out.println("Задание 5");
        task5(12);
        System.out.println("Задание 6");
        System.out.println(task6(24, 58_000));
        System.out.println("Задание 7");
        System.out.println(task7(25, 90_000, 330_000));

    }

    public static void task1( byte clientOS) {
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой клиент не найден.");
        }
    }

    public static void task2(byte clientOS, short clientDeviceYear) {
        short frontierYear = 2015;
        if (clientOS == 0 & clientDeviceYear >= frontierYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 & clientDeviceYear < frontierYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 & clientDeviceYear >= frontierYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 & clientDeviceYear < frontierYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой клиент не найден.");
        }
    }

    public static void task3(int year) {
        if (year%100 != 0 & year%4 == 0 || year%400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("На это расстояние мы не возим.");
        }
    }

    public static void task5(int monthNumber) {
        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяц не отностится ни к какому сезону");
        }
    }

    public static String task6(int age, int salary) {
        int creditLimit = age >= 23 ? salary * 3 : salary * 2;

        if (salary >= 80_000) {
            creditLimit *= 1.5;
        } else if (salary >= 50_000) {
            creditLimit *= 1.2;
        }

        return "Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей";
    }

    public static String task7(int age, int salary, int wantedSum) {
        double maxPayMonth = salary/2.;
        double bet = 1.1;

        if (age < 23) {
            bet += 0.01;
        } else if (age < 30) {
            bet += 0.005;
        }

        if (salary > 80_000) {
            bet -= 0.007;
        }

        double payMonth = wantedSum * bet / 12;

        String txt = "Максимальный платеж при ЗП " + salary + " равен " + maxPayMonth + " рублей. " +
                "Платеж по кредиту " + payMonth + " рублей. ";

        if (payMonth > maxPayMonth) {
            return txt + "Отказано";
        } else {
            return txt + "Одобрено";
        }
    }
}
