package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        task1();
        System.out.println("Задание 2");
        task2();
        System.out.println("Задание 3");
        task3(2004);
    }

    public static void task1() {
        byte clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой клиент не найден.");
        }
    }

    public static void task2() {
        byte clientOS = 0;
        short clientDeviceYear = 2016;

        if (clientOS == 0 & clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 & clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 & clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 & clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой клиент не найден.");
        }
    }

    public static void task3(int year) {
        boolean isYearFour = year%4 == 0;
        boolean isYearHundred = year%100 == 0;
        boolean isYearFourHundred = year%400 == 0;

        if (isYearFour || isYearFourHundred & !isYearHundred) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}
