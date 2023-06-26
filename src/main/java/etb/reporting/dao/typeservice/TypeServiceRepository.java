package etb.reporting.dao.typeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TypeServiceRepository  extends JpaRepository<TypeService,Long> {
}
