import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner input = new Scanner(System.in);

        // Вводим значения m и n
        System.out.print("Enter the value of m: ");
        int m = input.nextInt();

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        // Переменная для хранения произведения
        long product = 1; // Используем long для больших чисел
        boolean hasOdd = false; // Флаг для проверки наличия нечетных чисел

        // Проходим по всем числам в диапазоне от m до n
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) { // Если число нечетное
                product *= (i * i); // Умножаем его квадрат на произведение
                hasOdd = true; // Устанавливаем флаг
            }
        }

        // Выводим результат
        if (hasOdd) {
            System.out.println("Product of squares of odd numbers: " + product);
        } else {
            System.out.println("There are no odd numbers in the interval.");
        }
    }
}

