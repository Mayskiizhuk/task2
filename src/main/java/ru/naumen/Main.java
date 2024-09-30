package ru.naumen;

import HW.Array;
import HW.HTTP;
import HW.Sort;
import StreamAPI.StreamAPI;
import Task.TaskTest;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 2. Выберите пункт меню:");
        printMenu();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int choice = -1;
            while (flag) {
                try {
                    choice = scanner.nextInt();
                    if (choice >= 0 && choice <= 5)
                        flag = false;
                    else {
                        System.out.println("Введите целое число от 0 до 5");
                        printMenu();
                    }
                } catch (Exception e) {
                    System.out.println("Введите целое число от 0 до 5");
                    scanner.next();
                }
            }
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    Array array = new Array();
                    break;
                case 2:
                    Sort sort = new Sort();
                    break;
                case 3:
                    StreamAPI streamAPI = new StreamAPI();
                    break;
                case 4:
                    HTTP http = new HTTP();
                    break;
                case 5:
                    TaskTest taskTest = new TaskTest();
                    break;
            }
            flag = true;
            System.out.println();
            printMenu();
        }

    }
    static void printMenu() {
        System.out.println("1. Массив. Найти последний положительный элемент в массиве");
        System.out.println("2. Список. Сортировка выбором (Selection Sort)");
        System.out.println("3. Stream API. Преобразовать список сотрудников в список строк вида \"Имя -\" Отдел");
        System.out.println("4. HTTP клиент и JSON. Вывести только допустимые типы ответа (поле “Accept”) из заголовков");
        System.out.println("5. Реализация интерфейса “Task”");
        System.out.println("0. Выход");
    }
}