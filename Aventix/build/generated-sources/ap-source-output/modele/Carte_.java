package modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modele.Employe;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-16T21:22:44")
@StaticMetamodel(Carte.class)
public class Carte_ { 

    public static volatile SingularAttribute<Carte, Employe> employe;
    public static volatile SingularAttribute<Carte, Boolean> validite;
    public static volatile SingularAttribute<Carte, Float> solde;
    public static volatile SingularAttribute<Carte, Long> idCarte;
    public static volatile SingularAttribute<Carte, Integer> montantMaxJournalier;

}