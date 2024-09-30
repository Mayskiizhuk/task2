package ru.naumen;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort {
    public Sort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в списке ");
        int number = sc.nextInt();
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(Math.random() * 100);
        }
        System.out.println("Вывод списка");
        System.out.println(list);
        for (int i = 0; i < number; i++) {
            double temp = list.get(i);
            int index = i;
            for (int j = i + 1; j < number; j++) {
                if (list.get(j) < temp) {
                    temp = list.get(j);
                    index = j;
                }
            }
            list.set(index, list.get(i));
            list.set(i, temp);
        }
        System.out.println("Вывод списка, отсортированного Сортировкой выбором");
        System.out.println(list);
    }

}
