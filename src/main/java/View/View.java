package View;

import java.util.List;

public interface View <T>{

    String getName();
    String getBirthday();
    String getCommands();

    <U> void printAll (List<U> list, Class <U> petClass);
    void showMessage (String s);

}
