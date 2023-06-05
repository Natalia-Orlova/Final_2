package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pet {
    private int id;
    private String name;
    private String birthday;
    private String commands;

    static Scanner sc = new Scanner(System.in);


    public Pet(int id, String name, String birthday, String commands) {

        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    /**
     * Узнать номер id питомца
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Установить id для питомца
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Узнать имя питомца
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Задать имя питомца
     * @param name - новое имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Узнать дату рождения питомца
     * @return
     */
    public String getBirthday() {
        return this.birthday;
    }

//    /**
//     * Узнать дату рождения в формате String
//     * @return
//     */
//    public String getBirthdayString() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        return formatter.format(birthday);
//    }

    /**
     * Установить дату рождения
     * @param date
     */
    public void setBirthday(String date) {
        this.birthday = date;
    }

    /**
     * Получить список команд, которые выполняет питомец
     * @return
     */
    public String getCommandList() {
        return this.commands;
    }

    /**
     * Задать команды, выполняемые питомцем
     * @param commands
     */
    public void setCommands(String commands) {
        this.commands = commands;
    }

    /**
     * Обучить новой команде
     * @param newCommand - новая команда
     */
    public void addCommand(String newCommand) {
        commands = commands + newCommand;
        // commands = new StringBuilder(commands).append(newCommand).toString();
    }

    /**
     * Удалить команду
     *
     * @param command
     */
    public void removeCommand(String command) {
        commands.replace(command, "");
    }

    @Override
    public String toString() {
        return String.format("%d. имя: %s, дата рождения: %s, команды: %s\n",
                getId(), getName(), getBirthday(), getCommandList());
    }
}
