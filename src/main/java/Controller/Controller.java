package Controller;

import Model.AnimalCreator;
import Model.Pet;
import Model.PetType;
import Services.PetsList;
import View.ConsoleView;
import View.Menu;

import java.util.List;
import java.util.Scanner;

public class Controller {

    private static final PetsList<Object> pets = new PetsList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void buttonClick() {
        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("Выберите действие: \n");
                Menu.mainMenu();
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                       // завести нового питомца
                        pets.addPet(AnimalCreator.createPet());
                        break;
                    case "2":
                        // Добавить новую команду
                        // показать список всех животных и выбрать из списка того, кому добавить команду
                        ConsoleView.printPetsList(pets);
                        System.out.println("Введите номер питомца для добавления команды: ");
                        pets.getPetByIndex(scanner.nextInt());
                        break;
                    case "3":
                        // Показать всех питомцев
                        ConsoleView.printPetsList(pets);
                        break;
                    case "4":
                        // Показать команды
                        ConsoleView.printPetsList(pets);
                        System.out.println("Введите номер питомца для просмотра команд: ");

                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Такой команды нет");
                        break;


                }
            }
        }
    }
}