import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner input = new Scanner(System.in);

        // Вводим координаты x1, y1, x2, y2
        System.out.print("Enter the x1 = ");
        int x1 = input.nextInt();

        System.out.print("Enter the y1 = ");
        int y1 = input.nextInt();

        System.out.print("Enter the x2 = ");
        int x2 = input.nextInt();

        System.out.print("Enter the y2 = ");
        int y2 = input.nextInt();

        // Проверяем, лежат ли точки на одной вертикали (x1 == x2) или горизонтали (y1 == y2)
        if (x1 == x2 || y1 == y2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
