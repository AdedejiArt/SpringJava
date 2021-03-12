package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Houses;
import org.springframework.data.repository.CrudRepository;

public interface HousesRepository extends CrudRepository<Houses,Long> {
}
