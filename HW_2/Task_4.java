package HW_2;//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

// Тут решил использовать throws, после просмотра следующей лекции =)

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try {
            inputString();
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }

    public static void inputString() throws Exception {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if (text.equalsIgnoreCase(""))
            throw new Exception();
        System.out.println("Вы молодец, ввели не пустую строку!");
    }
}