package etb.reporting.dao.invoicingelemnts;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "V_FACT_UNION_CONSOM_FPSa")
public class InvoicingElements {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "NUM_FACT")
    String numFact;
    @Column(name = "Produit")
    String obs;

//    ,CODE_CLIENT,
//    CODE_UNIT, ,PRIX,VALIDE  ,code_stag,code_prom, ,
//    qtt,DESIGN_SERV,num_serv,num_hot,type_service ,dd ,VOIRE_DANS_REST,nom_stag,prenom_stag,dprf,fprf

}
