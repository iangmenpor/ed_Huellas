package com.iesam.huellas.feature.pets.domain;

public class Pet {

    private String id;
    private String name;
    private String gender;
    private String dateBorn;
    private String description;
    private String urlImage;


    //Como la info nos llega de backed siempre habrá datos por lo que no se requiere un constructor null, asi se evita que se cree un gato sin data
    public Pet(String id, String name, String gender, String dateBorn, String description, String urlImage) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateBorn = dateBorn;
        this.description = description;
        this.urlImage = urlImage;
    }

    //-GETTERs SETTERs
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(String dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateBorn='" + dateBorn + '\'' +
                ", description='" + description + '\'' +
                ", urlImage='" + urlImage + '\'' +
                '}';
    }
}
