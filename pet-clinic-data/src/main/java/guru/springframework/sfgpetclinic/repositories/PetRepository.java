package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Miroslav Komar 10.06.2022
 **/
public interface PetRepository extends CrudRepository<Pet, Long> {
}
