package etb.reporting.dao.budget;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor@NoArgsConstructor

public class Budget {
    @Id @GeneratedValue
    Long id;
    @Column(name = "lib",length = 50)
    String lib;
    @Column(name = "EXO",length = 4)
    String   exercice;
}
