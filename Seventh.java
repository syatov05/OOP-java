import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner input = new Scanner(System.in);

        // Вводим два числа
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Переменная для хранения наибольшего общего делителя
        int gcd = 1; // Начинаем с 1, так как это минимальный возможный НОД

        // Находим наибольший общий делитель, начиная с минимального из num1 и num2
        int min = Math.min(num1, num2);

        // Перебираем все числа от min до 1
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) { // Проверяем, является ли i делителем обоих чисел
                gcd = i; // Сохраняем i как НОД
                break; // Выходим из цикла, так как нашли наибольший делитель
            }
        }


        // Выводим результат
        System.out.println((num1*num2)/gcd);
    }
}
