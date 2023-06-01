package Model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Pet {
    protected int ID;
    protected String name;
    protected LocalDate birthday;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdayDate() {
        return birthday;
    }

    //преобразование даты к строке
    public String getBirthday() {
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return myDateFormat.format(birthday);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%d. name: %s, birthday: %s ", getID(), name, getBirthday());
    }
}
