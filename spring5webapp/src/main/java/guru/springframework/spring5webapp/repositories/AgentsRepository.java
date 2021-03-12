package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agents,Long> {
}
