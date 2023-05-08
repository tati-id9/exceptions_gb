package hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Task2 task2 = new Task2();
        int[] array1 = task2.inputArray();
        int[] array2 = task2.inputArray();

        int[]array3 = task2.diffArray(array1,array2);
        System.out.println(Arrays.toString(array3));

    }

    public int[] inputArray (){
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = iScan.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива с новой строки");
        for (int i = 0; i < size; i++) {
            array[i] = iScan.nextInt();
        }
        iScan.close();
        return array;
    }
    public int[] diffArray (int[] arr1, int[] arr2){
        if (arr1.length != arr2.length) {
            throw new ArrayIndexOutOfBoundsException("Массивы разной длины");
        }
        int[] result = new int [arr1.length];
        for (int i=0; i<arr1.length; i++)
        {
            result[i] = arr1[i]-arr2[i];
        }
        return result;
    }
}
