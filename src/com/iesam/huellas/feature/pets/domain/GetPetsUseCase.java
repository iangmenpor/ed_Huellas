package com.iesam.huellas.feature.pets.domain;

import java.util.ArrayList;

public class GetPetsUseCase { //tmb sirve feed

    private PetRepository petRepository;

    public GetPetsUseCase(PetRepository petRepository){
        this.petRepository = petRepository;
    }
    public ArrayList<Pet> execute() {
        return petRepository.obtainPets();
    }
}
