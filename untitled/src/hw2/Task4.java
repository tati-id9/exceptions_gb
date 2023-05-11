package hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Task4 task = new Task4();
        StringBuilder value = new StringBuilder();
        while (value.isEmpty()) {
            try {
                value = task.inputStr();
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(value);
    }
    public StringBuilder inputStr () throws MyException {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите значение: ");
        StringBuilder str = new StringBuilder(iScan.nextLine());
        if (str.isEmpty()){
            throw new MyException("Ввведена пустая строка. Введите значение.");
        }
        iScan.close();
        return str;
    }
}
