package View;

import Model.Pet;
import Services.Counter;
import Services.PetsList;

import java.util.Scanner;

public class ConsoleView {

    static Scanner scanner = new Scanner(System.in);
    private static PetsList<Pet> pets = new PetsList<>();
    private static int id;


    public static int getId() {
        id = id + 1;
        return id;
    }

    public static String setName() {
        System.out.print("Ведите имя питомца: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Введено некорректное значение, повторите попытку");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static String setBirthday() {
        System.out.print("Введите дату рождения в формате '01.01.2001': ");
        if (!scanner.hasNextLine()) {
            System.out.println("Введено некорректное значение, повторите попытку");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }

    public static String setCommands() {
        System.out.print("Введите команды, выполняемые питомцем: ");
        if (!scanner.hasNextLine()) {
            System.out.println("Введено некорректное значение, повторите попытку");
            scanner.nextLine();
        }
        return scanner.nextLine();
    }


    public static void printPetsList(PetsList<Pet> pets) {
        System.out.printf("Всего питомцев: %d \n", Counter.getCount());
        System.out.println("Список питомцев: ");
        for (Object pet : pets.getPets()) {
            System.out.print(pet);
        }
        System.out.println();
    }

}