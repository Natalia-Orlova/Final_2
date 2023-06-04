import Model.Cat;
import Model.Dog;
import Model.Hamster;
import Model.Pet;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = Arrays.asList(
                new Cat(1, "Tom", LocalDate.of(2020, 5,12), "Сидеть"),
                new Dog(2, "Bob", LocalDate.of(2019,8,5), "Сидеть, лежать"),
                new Hamster(3, "Jerry", LocalDate.of(2023,2,25), "Крутись")
        );

        System.out.println(pets);


    }

}