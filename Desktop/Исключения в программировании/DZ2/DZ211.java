// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
import java.util.Scanner;
public class DZ211 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
    while (true) {
            String num = sc.nextLine();
            try {
                float n = Float.parseFloat(num);
                System.out.println("Введённое число: " + n);
                System.exit(1);
            } catch (NumberFormatException e) {
                System.out.println("Неправильный ввод, введите дробное число:  ");
            }
        }
    }
}
