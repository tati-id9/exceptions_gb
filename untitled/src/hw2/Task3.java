package hw2;

public class Task3
{
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);
            printSum(null, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс выходит за пределы размера массива!");
        } catch (NullPointerException ex) {
            System.out.println("Аргумент не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль недопустимо!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
