package View;

import Model.Pet;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View <Pet> {

    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in, "ibm866");
    }

    @Override
    public String getName() {
        System.out.print("Имя питомца: ");
        return in.nextLine();
    }

    @Override
    public String getBirthday() {
        System.out.print("Введите дату рождения в формате '01.01.2001': ");
        return in.nextLine();
    }

    @Override
    public String getCommands() {
        System.out.print("Введите команды, выполняемые питомцем: ");
        return in.nextLine();
    }

    @Override
    public <T> void printAll (List<T> list, Class <T> petClass) {
        System.out.print("\033[H\033[J");
        if (list.isEmpty())
            System.out.println("В списке пока нет питомцев");
        else {
            if (petClass == Pet.class)
                System.out.println("\nСписок питомцев:");
            for (T item : list) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}