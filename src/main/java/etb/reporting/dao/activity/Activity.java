package etb.reporting.dao.activity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TYPE_FACTURATION",schema = "fact")


public class Activity {
    @Id
    @Column(name = "CODE_TYPE_FACT",length = 5)
    String id;
    @Column(name = "TYPE_FACT")
    String des;


}
