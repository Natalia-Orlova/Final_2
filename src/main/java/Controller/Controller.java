package Controller;

import Model.*;
import Services.PetsList;
import View.ConsoleView;
import View.Menu;

import java.util.Scanner;

public class Controller {

    //private static List<Pet> pets = new ArrayList<>();
    private static final PetsList<Pet> pets = new PetsList<>();
    //static Scanner scanner = new Scanner(System.in);
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
                        System.out.println("Выберите вид питомца: \n");
                        Menu.petsMenu();
                        String key1 = in.next();
                        switch(key1) {
                            case "1":
                                pets.addPet(AnimalCreator.createPet());
                                System.out.println("Кот (кошка) добавлен(а) в список питомцев");
                                continue;
                            case "2":
                                pets.addPet(AnimalCreator.createPet());
                                System.out.println("Собака добавлена в список питомцев");
                                continue;
                            case "3":
                                pets.addPet(AnimalCreator.createPet());
                                System.out.println("Хомяк добавлен в список питомцев");
                                continue;
                            case "0":
                                continue;
                            default:
                                System.out.println("Такой команды нет");
                                break;
                        }
                        break;
                    case "2":
                        // Добавить новую команду
                        // показать список всех животных и выбрать из списка того, кому добавить команду
                        ConsoleView.printPetsList(pets);
                        System.out.println("Выберите номер питомца для добавления команды: ");
                        int id = in.nextInt();
                        System.out.println("Введите команду: ");
                        String command = in.next();
                        pets.getPetByIndex(id).addCommand(command);
                        System.out.printf("Команды для %s успешно добавлены \n\n", pets.getPetByIndex(id).getName());
                        break;
                    case "3":
                        // Показать всех питомцев
                        ConsoleView.printPetsList(pets);
                        break;
                    case "4":
                        // Показать команды
                        ConsoleView.printPetsList(pets);
                        System.out.println("Выберите номер питомца для просмотра команд: ");
                        int id1 = in.nextInt();
                        System.out.printf("Список команд питомца %s: \n%s \n\n",
                                pets.getPetByIndex(id1).getName(), pets.getPetByIndex(id1).getCommandList());
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