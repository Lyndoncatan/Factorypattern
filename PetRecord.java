package FactoryPattern;

public class PetRecord {
    private final String petId;
    private final String petName;
    private final Pet pet;

    public PetRecord(String petId, String petName, Pet pet) {
        this.petId = petId;
        this.petName = petName;
        this.pet = pet;
    }

    public String getPetId() {
        return petId;
    }

    public String getPetName() {
        return petName;
    }

    public Pet getPet() {
        return pet;
    }
}
