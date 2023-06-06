package Model;

import View.ConsoleView;

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

    private static final List<Pet> pets = new ArrayList<>();
    public static Pet createPet () {

        return new Pet(ConsoleView.getId(), ConsoleView.setName(),
                ConsoleView.setBirthday(), ConsoleView.setCommands());
    }
}
