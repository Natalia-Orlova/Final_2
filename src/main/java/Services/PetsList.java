package Services;

import Model.AnimalCreator;
import View.ConsoleView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PetsList <Pet> {
    Scanner scanner = new Scanner(System.in);
    private List<Pet> pets = new ArrayList<>();


    /**
     * добавить питомца
     *
     * @param pet
     */
    public void addPet(Pet pet) {
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


    /**
     * Получить питомца из списка питомцев по индексу
     * @param index
     * @return
     */
//    public Pet getPetByIndex(int index) {
//        if (index <= pets.size()) {
//            return pets.get(index);
//        } else {
//            System.out.println("в списке нет питомца с таким id, повторите попытку");
//        }
//    }


}
