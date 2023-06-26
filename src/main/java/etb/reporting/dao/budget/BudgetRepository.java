package etb.reporting.dao.budget;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BudgetRepository extends JpaRepository<Budget,Long> {
}
