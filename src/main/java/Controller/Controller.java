package Controller;

import Model.Pet;
import Model.PetType;
import Services.PetsList;
import View.Menu;

import java.util.List;
import java.util.Scanner;

public class Controller {

    private final PetsList<Object> pets = new PetsList<>();
    public static void buttonClick() {
        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("Выберите действие: \n");
                System.out.println(Menu.mainMenu());
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                       // завести нового питомца
                        break;
                    case "2":
                        // Добавить новую команду
                    case "3":
                        // Показать всех питомцев
                    case "4":
                        // Показать команды
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