package Model;

import java.time.LocalDate;

public abstract class PetCreator extends AnimalCreator {

    @Override
    protected Pet createNewPet(PetType type) {
        switch (type) {
            case Cat -> new Cat();
            case Dog -> new Dog();
            case Hamster -> new Hamster();
            }
        }
    }
}

