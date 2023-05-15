package hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = iScan.nextLine();
        System.out.println("Введите пароль: ");
        String password = iScan.nextLine();
        System.out.println("Повторите пароль: ");
        String confirmPassword = iScan.nextLine();
        iScan.close();

        DataValidate dv = new DataValidate();
        if(dv.inputValidation(login, password, confirmPassword) == true){
            System.out.println("Добро пожаловать, " + login);
        }
    }
}