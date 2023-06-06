package Model;

import View.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public abstract class PetCreator {

    private static final List<Pet> pets = new ArrayList<>();
    public static Pet createPet () {

        return new Pet(ConsoleView.getId(), ConsoleView.setName(),
                ConsoleView.setBirthday(), ConsoleView.setCommands());
    }
}
