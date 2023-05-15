package hw3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidate {
    static String pattern = "[A-Za-z0-9]*_?[A-Za-z0-9]*";

    static public boolean inputValidation (String login, String password, String confirmPassword){

        Pattern myPattern = Pattern.compile(pattern);
        Matcher loginMatcher = myPattern.matcher(login);
        Matcher passwordMatcher = myPattern.matcher(password);
        try {
            if (!loginMatcher.matches()) {
                throw new WrongLoginException("Логин содержит недопустимые символы");
            }
            if (login.length() > 19) {
                throw new WrongLoginException("Логин слишком длинный");
            }
            if (!passwordMatcher.matches()) {
                throw new WrongPasswordException("Пароль содержит недопустимые символы");
            }
            if (password.length() > 19) {
                throw new WrongPasswordException("Пароль слишком длинный");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Неверное подтверждение пароля");
            }
        } catch (WrongPasswordException | WrongLoginException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
        return true;
    }
}
