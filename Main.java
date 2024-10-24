import java.util.Scanner; // Импортируем класс Scanner для ввода данных

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных с клавиатуры
        Scanner input = new Scanner(System.in);

        // Запрашиваем у пользователя количество элементов
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        // Создаем массив для хранения чисел
        int[] numbers = new int[n];
        int count = 0; // Счетчик для пар с одинаковыми знаками

        // Запрашиваем у пользователя ввод чисел
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt(); // Заполняем массив числами
        }

        // Проверяем пары чисел на одинаковые знаки
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] * numbers[i + 1] > 0) { // Если оба числа имеют одинаковый знак
                count++; // Увеличиваем счетчик
            }
        }

        // Выводим результат
        if (count > 0) {
            System.out.println("YES"); // Есть хотя бы одна пара с одинаковыми знаками
        } else {
            System.out.println("NO"); // Нет пар с одинаковыми знаками
        }
    }
}
