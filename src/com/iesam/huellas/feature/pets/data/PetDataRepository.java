package com.iesam.huellas.feature.pets.data;

import com.iesam.huellas.feature.pets.domain.Pet;
import com.iesam.huellas.feature.pets.domain.PetRepository;

import java.util.ArrayList;

public class PetDataRepository implements PetRepository {//Esto es una concresion (son clases)
    @Override
    public ArrayList<Pet> obtainPets() {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Pet("1","Petunia", "Macho", "10/10/2010","gato negro","image.png" ));
        pets.add(new Pet("2","Zeus", "Macho", "10/11/2010","gato blanco","image.png" ));

        return pets;
    }


}
