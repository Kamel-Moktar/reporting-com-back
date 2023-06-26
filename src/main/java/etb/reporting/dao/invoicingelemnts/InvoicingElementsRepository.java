package etb.reporting.dao.invoicingelemnts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InvoicingElementsRepository extends JpaRepository<InvoicingElements,Long > {
}
