import java.util.Scanner;
  //Разработайте программу, которая выбросит Exception,
  //когда пользователь вводит пустую строку.
  //Пользователю должно показаться сообщение,
  //что пустые строки вводить нельзя.
public class DZ214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = sc.nextLine();
        if (!text.isEmpty()){
            System.out.println("Вы ввели: " + text);
        } else
        throw new RuntimeException("Пустые строки вводить нельзя!");   
    }
}
