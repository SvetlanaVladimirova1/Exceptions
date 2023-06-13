import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные в следующем формате через пробелы: " +
                "фамилия имя отчество номер_телефона(только цифры) \n");
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        if (data.length != 4) {
            System.out.println("Ошибка! Введены не все данные");
            return;
        }
        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[3]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Неверный формат номера телефона. Введите только цифры");
            return;
        }
        Person person = new Person(lastName, firstName, middleName, phoneNumber);
        Map<String, Person> personMap = new HashMap<>();
        personMap.put(lastName, person);
        FileCreator.createFiles(personMap);
    }
    public static class FileCreator {
        public static final String FILE_EXTENSION = ".txt";
        public static void createFiles(Map<String, Person> personMap) {
            Map<String, BufferedWriter> writerMap = new HashMap<>();
            try {
                for (Person person : personMap.values()) {
                    String fileName = person.getLastName() + FILE_EXTENSION;
                    if (!writerMap.containsKey(fileName)) {        
                        File file = new File(fileName);
                        boolean fileExists = file.exists();
                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter writer = new BufferedWriter(fileWriter);
                        if (fileExists) {
                            writer.newLine();
                        }
                        writerMap.put(fileName, writer);
                    }
                    BufferedWriter writer = writerMap.get(fileName);
                     writer.write(person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName()
                            + " "  + person.getPhoneNumber()
                            );
                    writer.newLine();
                }
                for (BufferedWriter writer : writerMap.values()) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}