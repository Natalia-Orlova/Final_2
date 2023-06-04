package Services;

import java.util.ArrayList;
import java.util.List;

public class PetsList <Pet> {
    private List<Pet> pets = new ArrayList<>();


    /**
     * добавить питомца
     *
     * @param pet
     */
    public void addAnimal(Pet pet) {
        pets.add(pet);
    }

    /**
     *
     * @param pet
     * @return
     */
    public boolean removePet(Pet pet){
        return pets.remove(pet);
    }

    /**
     * Получить список животных
     * @return
     */
    public List<Pet> getPets(){
        return pets;
    }
}
