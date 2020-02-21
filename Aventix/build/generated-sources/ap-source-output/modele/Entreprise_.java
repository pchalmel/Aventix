package modele;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modele.Commande;
import modele.Employe;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-02-21T14:16:22")
@StaticMetamodel(Entreprise.class)
public class Entreprise_ { 

    public static volatile CollectionAttribute<Entreprise, Commande> commandes;
    public static volatile SingularAttribute<Entreprise, String> password;
    public static volatile SingularAttribute<Entreprise, String> adresse;
    public static volatile SingularAttribute<Entreprise, String> nomEntreprise;
    public static volatile SingularAttribute<Entreprise, String> telephone;
    public static volatile SingularAttribute<Entreprise, Long> idEntreprise;
    public static volatile CollectionAttribute<Entreprise, Employe> employes;
    public static volatile SingularAttribute<Entreprise, String> email;

}