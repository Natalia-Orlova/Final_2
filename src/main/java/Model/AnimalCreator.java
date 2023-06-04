package Model;

import java.time.LocalDate;

public abstract class AnimalCreator {
    protected abstract Pet createNewPet(PetType type);

    public Pet createPet(PetType type, String name, LocalDate date, String command) {

        Pet pet = createNewPet(type);
        pet.setName(name);
        pet.setBirthday(date);
        pet.setCommands(command);
        return pet;
    }
}