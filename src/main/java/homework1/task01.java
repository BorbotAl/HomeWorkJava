//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        MaxMinArray();
    }

    public static void MaxMinArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lengthArray = in.nextInt();
        int[] array = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.printf("Введите значение %s элемента\n", i);
            array[i] = in.nextInt();
        }
        int maxElement = array[0];
        int minElement = array[0];
        for (int i = 1; i < lengthArray; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("В массиве максимальный элемент - %s, минимальный - %s", maxElement, minElement);
    }
}
