package modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-14T19:14:11")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Long> idCommercant;
    public static volatile SingularAttribute<Transaction, Long> idCarte;
    public static volatile SingularAttribute<Transaction, Float> montant;
    public static volatile SingularAttribute<Transaction, Date> dateTransaction;
    public static volatile SingularAttribute<Transaction, Boolean> statut;
    public static volatile SingularAttribute<Transaction, Long> idTransaction;

}