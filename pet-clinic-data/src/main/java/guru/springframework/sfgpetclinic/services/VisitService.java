package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Miroslav Komar 10.06.2022
 **/
public interface VisitService extends CrudService<Visit, Long> {
}
