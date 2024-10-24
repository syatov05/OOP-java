import java.util.Scanner; // Импортируем класс Scanner для ввода данных

public class Second {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода с клавиатуры
        Scanner input = new Scanner(System.in);

        // Запрашиваем у пользователя количество элементов
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        // Создаем массив для хранения чисел
        int[] numbers = new int[n];
        int count = 0; // Переменная для подсчета положительных чисел

        // Запрашиваем ввод чисел
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt(); // Заполняем массив числами
        }

        // Подсчитываем количество положительных чисел
        for (int i = 0; i < n; i++) {
            if (numbers[i] > 0) {
                count++; // Увеличиваем счетчик для каждого положительного числа
            }
        }

        // Выводим количество положительных чисел
        System.out.println("Count of positive numbers: " + count);
    }
}
