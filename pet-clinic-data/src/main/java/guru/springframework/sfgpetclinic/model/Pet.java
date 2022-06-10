package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name ="owner_id")
    private Owner owner;

    @ManyToOne
    @JoinTable(name = "type_id")
    private PetType petType;

    @Column(name = "birth_date")
    private LocalDate birhDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
