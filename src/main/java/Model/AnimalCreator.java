package Model;

import View.ConsoleView;

import java.io.Console;
import java.time.LocalDate;

public abstract class AnimalCreator {
//    protected abstract Pet createNewPet(PetType type);
//
//    public Pet createPet(PetType type, String name, String date, String command) {
//
//        Pet pet = createNewPet(type);
//        pet.setName(name);
//        pet.setBirthday(date);
//        pet.setCommands(command);
//        return pet;
//    }

    public static Pet createPet () {
        return new Pet(ConsoleView.getId(), ConsoleView.getName(), ConsoleView.getBirthday(), ConsoleView.getCommands());
    }
}
