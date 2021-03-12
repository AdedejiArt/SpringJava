package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Lands;
import org.springframework.data.repository.CrudRepository;

public interface LandsRepository extends CrudRepository<Lands,Long> {
}
