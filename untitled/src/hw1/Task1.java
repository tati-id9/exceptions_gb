package hw1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        Integer number1 = null, number2 = null;
        Scanner iScan = new Scanner(System.in);
        do {
                try {
                    System.out.print("Введите первое значение, число должно быть целым: ");
                    number1 = iScan.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("Значение должно быть целым числом");
                    iScan.nextLine();
                }
        } while (number1 == null);

        do {
            try {
                System.out.print("Введите второе значение, число должно быть целым больше 0: ");
                number2 = iScan.nextInt();
                if (number2<=0) {
                    System.out.println("Значение должно быть больше 0");
                    number2 = null;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Значение должно быть целым числом");
                iScan.nextLine();
            }

        } while (number2 == null);
        iScan.close();

        System.out.println(task1.division(number1, number2));
    }
    public static int division(Integer value1, Integer value2){
        return value1/value2;
    }
}
