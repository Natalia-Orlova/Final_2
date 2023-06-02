package Model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

public interface Pet {
    /**
     * Получить имя животного
     * @return
     */
    String getName();

    /**
     * Установить дату рождения
     * @param date
     */
    void setBirthday(String date);

    /**
     * Получить дату рождедния
     * @return
     */
    String getBirthday();

    /**
     * Установить имя животного
     * @param name - новое имя
     */
    void setName(String name);

    /**
     * Обучить животное новой команде
     * @param newCommand - новая команда
     */
    void addCommand(String newCommand);

    /**
     * Удалить команду
     * @param command
     */
    void removeCommand(String command);

    /**
     * Список команд
     * @return
     */
    List<String> getCommandList();
}
