package HW;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public Array() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве ");
        int number = sc.nextInt();
        int [] arr = new int [number];
        for (int i = 0; i<arr.length; i++){
            arr[i] = -50+(int)(Math.random()*100);
        }
        System.out.println("Вывод массива");
        System.out.println(Arrays.toString(arr));
        System.out.println("Вывод последнего положительного элемента в массиве");
        for (int i = arr.length-1; i >=0; i--){
            if (arr[i]>0) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
