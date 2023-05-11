package hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 task = new Task2();
        int[] array = task.inputArray();
        task.divArr(array);
    }
    public void divArr(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль недопустимо!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введенный индекс находится за пределами длины массива!");
        }
    }
    public int[] inputArray (){
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = iScan.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива с новой строки");
        for (int i = 0; i < size; i++) {
            array[i] = iScan.nextInt();
        }
        iScan.close();
        return array;
    }
}
