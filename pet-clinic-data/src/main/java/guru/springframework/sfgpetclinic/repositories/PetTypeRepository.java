package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Miroslav Komar 10.06.2022
 **/
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
    
}
