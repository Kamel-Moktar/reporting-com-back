package etb.reporting.dao.groupeclient;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "entreprise",schema = "omar")
public class GroupeClient {
    @Id
    @GeneratedValue
    @Column(name = "CODE_ENTP")
    Long id;
    @Column(name = "DESIGN_ENTP")
    String des ;
    @Column(name = "RANG")
    Short rang;

}
