package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private Owner owner;
    private PetType petType;
    private LocalDate birhDate;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public LocalDate getBirhDate() {
        return birhDate;
    }

    public void setBirhDate(LocalDate birhDate) {
        this.birhDate = birhDate;
    }
}
