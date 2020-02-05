package modele;

import java.text.DateFormat;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-05T00:28:24")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Long> idEmployeur;
    public static volatile SingularAttribute<Commande, Integer> prixUnitaire;
    public static volatile SingularAttribute<Commande, Float> montantTotal;
    public static volatile SingularAttribute<Commande, Long> nbCartes;
    public static volatile SingularAttribute<Commande, DateFormat> shortDateFormat;
    public static volatile SingularAttribute<Commande, String> commentaires;
    public static volatile SingularAttribute<Commande, Date> dateCommande;
    public static volatile SingularAttribute<Commande, Long> idCommande;

}