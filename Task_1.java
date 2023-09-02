
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
//пользователя ввод данных.
    public class Main {
        public static void main(String[] args) {
            System.out.println("Ваше число: " + returnFloat());
        }

        public static float returnFloat() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число float:");
            try {
                return sc.nextFloat();
            } catch (InputMismatchException e) {
                return returnFloat();
            }
        }
    }
}
