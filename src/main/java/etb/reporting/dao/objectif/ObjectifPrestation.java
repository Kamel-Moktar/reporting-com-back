package etb.reporting.dao.objectif;

import etb.reporting.dao.budget.Budget;
import etb.reporting.dao.budget.Month;
import etb.reporting.dao.typeservice.TypeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Check(constraints = "month>0 and month<13 ")
public class ObjectifPrestation {
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "month")
    Month month;
    @ManyToOne
    Budget budget;
    @ManyToOne
    TypeService typeService;
    @Column(name = "val")
    Double value;
}
