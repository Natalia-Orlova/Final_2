package Model;

import java.util.List;

public class Cat implements Pet{
    private String name;
    private String birthday;
    private List<String> commands;


    public Cat(String name, String birthday, List<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }


    /**
     * Узнать имя питомца
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Задать имя питомца
     * @param name - новое имя
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Узнать дату рождения питомца
     * @return
     */
    @Override
    public String getBirthday() {
        return this.birthday;
    }

    /**
     * Установить дату рождения
     * @param date
     */
    @Override
    public void setBirthday(String date) {
        this.birthday = date;
    }

    /**
     * Получить список команд, которые выполняет питомец
     * @return
     */
    @Override
    public List<String> getCommandList() {
        return this.commands;
    }

    /**
     * Обучить новой команде
     * @param newCommand - новая команда
     */
    @Override
    public void addCommand(String newCommand) {
        commands.add(newCommand);
    }

    /**
     * Удалить команду
     *
     * @param command
     */
    @Override
    public void removeCommand(String command) {
        commands.remove(command);
    }

    @Override
    public String toString() {
        return String.format("имя: %s, дата рождения: %s, команды: %s", getName(), getBirthday(), getCommandList());
    }
}
