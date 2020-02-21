package modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modele.Carte;
import modele.Entreprise;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-21T11:55:44")
@StaticMetamodel(Employe.class)
public class Employe_ { 

    public static volatile SingularAttribute<Employe, Entreprise> entreprise;
    public static volatile SingularAttribute<Employe, String> password;
    public static volatile SingularAttribute<Employe, Carte> carte;
    public static volatile SingularAttribute<Employe, String> adresse;
    public static volatile SingularAttribute<Employe, String> prenom;
    public static volatile SingularAttribute<Employe, String> nom;
    public static volatile SingularAttribute<Employe, Long> idEmploye;
    public static volatile SingularAttribute<Employe, String> email;

}