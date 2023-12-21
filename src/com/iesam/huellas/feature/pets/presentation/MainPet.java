package com.iesam.huellas.feature.pets.presentation;

import com.iesam.huellas.feature.pets.data.PetDataRepository;
import com.iesam.huellas.feature.pets.domain.GetPetsUseCase;
import com.iesam.huellas.feature.pets.domain.Pet;

import java.util.ArrayList;

public class MainPet {


    //-Mostrar un listado de mascotas
    public static void printPets(){
        GetPetsUseCase petsUseCase = new GetPetsUseCase(new PetDataRepository());
        ArrayList<Pet> pets = petsUseCase.execute();
        //imprimir cada una de las mascotas
        System.out.println(pets.toString());
    }

}
