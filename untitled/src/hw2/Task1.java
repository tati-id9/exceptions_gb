package hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Float number = null;
        Scanner iScan = new Scanner(System.in);
        do {
            try {
                System.out.print("Введите значение, число должно быть вещественным: ");
                number = iScan.nextFloat();
            }
            catch (InputMismatchException e){
                System.out.println("Значение должно быть вещественным числом");
                iScan.nextLine();
            }
        } while (number == null);
        iScan.close();
        System.out.println("Введеное значение: " + number);
    }
}
