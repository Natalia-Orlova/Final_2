package View;

public class Menu {
    public static void mainMenu() {
        System.out.println("1 - Завести нового питомца");
        System.out.println("2 - Добавить новую команду");
        System.out.println("3 - Показать всех питомцев");
        System.out.println("4 - Показать команды");
        System.out.println("0 - Выход");
    }

    public static void petsMenu(){
        System.out.println("1 - Кот");
        System.out.println("2 - Собака");
        System.out.println("3 - Хомяк");
        System.out.println("0 - Отмена");
    }

    private void choiceMenu (){
        System.out.println("1 - Yes");
        System.out.println("0 - No");
    }
}
