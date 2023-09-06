package HW_2;// 1) Убрал 'throws Exception' в заголовке Main - выше метода нет?
// 2) Убрал 'throws FileNotFoundException' в заголовке printSum - там нет работы с файлами.
// 3) Переместил catch (Throwable ex) в самый низ, чтобы он не перехватывал все подряд.

public class Task_3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}