import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //a a a 1.1.1 79000254046 m
    public static void main(String[] args) throws LongError, InputError {
        new_user();
    }

    public static void new_user() throws LongError, InputError {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел:Фамилия Имя Отчество дата рождения номер телефона пол\n" +
                "\n" +
                "Форматы данных:\n" +
                "фамилия, имя, отчество - строки\n" +
                "датарождения - строка формата dd.mm.yyyy\n" +
                "номертелефона - целое беззнаковое число без форматирования\n" +
                "пол - символ латиницей f или m.");
        String info = scanner.nextLine();
        String[] data = info.split("\\s");
        System.out.println(Arrays.toString(data));
        if (data.length == 6) {
            String user_name = data[0] + " " + data[1] + " " + data[2];
            String dod = data[3];
            String number = data[4];
            String gender = data[5].strip();
            if (!dod.contains(".")) {
                throw new InputError("Данный параметр был введён не верно (");
            } else if (number.length() != 11 || !isNumeric(number)) {
                throw new InputError("Данный параметр был введён не верно (");
            } else if (gender(gender)) {
                throw new InputError("Данный параметр был введён не верно (");
            } else {
                try {
                    File file = new File(data[0] + ".txt");
                    if (isFileExists(file)) {
                        FileWriter writer = new FileWriter(file, true);

                        writer.write(user_name + " " + dod + " " + number + " " + gender + "\n");

                        writer.close();
                    } else {
                        FileWriter writer = new FileWriter(data[0] + ".txt", false);
                        // запись всей строки
                        writer.write(user_name + " " + dod + " " + number + " " + gender + "\n");

                        writer.close();
                    }
                } catch (IOException e) {

                    System.out.println(e.getMessage());
                }
            }
        } else {
            throw new LongError("Здесь недостаточно или слишком много данных (");
        }
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean gender(String gen) {
        if (gen.equals("m") || gen.equals("f")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }
}
