package View;

import Model.Pet;
import Services.PetsList;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    static Scanner scanner = new Scanner(System.in);

    public static int getId() {
        System.out.print("Ведите id питомца: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Введено некорректное значение, повторите попытку");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static String getName() {
        System.out.print("Ведите имя питомца: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Введено некорректное значение, повторите попытку");
            scanner.nextLine();
        }
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static String getBirthday() {
        System.out.print("Введите дату рождения в формате '01.01.2001': ");
        if (!scanner.hasNextLine()) {
            System.out.println("Введено некорректное значение, повторите попытку");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static String getCommands() {
        System.out.print("Введите команды, выполняемые питомцем: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Введено некорректное значение, повторите попытку");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static void printPetsList(PetsList pets) {
        System.out.println("Список питомцев: ");
        for (Object pet : pets.getPets()) {
            System.out.println(pet + "\n");
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}