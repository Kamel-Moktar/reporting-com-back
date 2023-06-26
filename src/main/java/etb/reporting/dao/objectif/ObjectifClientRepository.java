package etb.reporting.dao.objectif;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface  ObjectifClientRepository extends JpaRepository<ObjectifClient,Long> {
}
