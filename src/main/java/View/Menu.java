package View;

public class Menu {
    public static boolean mainMenu() {
        System.out.println("1 - Завести нового питомца");
        System.out.println("2 - Добавить новую команду");
        System.out.println("3 - Показать всех питомцев");
        System.out.println("4 - Показать команды");
        System.out.println("0 - Выход");
        return false;
    }

    private void petsMenu (){
        System.out.println("1 - Cat");
        System.out.println("2 - Dog");
        System.out.println("3 - Hamster");
        System.out.println("0 - Отмена");
    }

    private void choiceMenu (){
        System.out.println("1 - Yes");
        System.out.println("0 - No");
    }
}
