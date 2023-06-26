package etb.reporting.dao.typeservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TYPE_SERVICE",schema = "KAM")
public class TypeService {

    @Id
    @GeneratedValue
    @Column(name = "CODE_TYPE_SERV")
    Long id;
    @Column(name = "TYPE_SERVICE")
    String des ;
}
