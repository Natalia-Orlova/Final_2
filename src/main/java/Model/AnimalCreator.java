package Model;

import View.ConsoleView;

import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    private static List<Pet> pets = new ArrayList<>();
    public static Pet createPet () {
        return new Pet(pets.size()+1, ConsoleView.getName(),
                ConsoleView.getBirthday(), ConsoleView.getCommands());
    }
}
