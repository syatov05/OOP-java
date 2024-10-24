import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner input = new Scanner(System.in);

        // Запрашиваем у пользователя число
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Вывод делителей числа в порядке убывания
        System.out.println("Divisors of " + number + " in descending order:");
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) { // Если i делитель числа
                System.out.print(i + " "); // Выводим его
            }
        }
    }
}
