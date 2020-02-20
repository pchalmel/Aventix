                               /*Classe ServiceFacturation*/

package modele;

/*----------------------------------IMPORTS-----------------------------------*/

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import services.ServicesImpl;

/*--------------------------------FIN IMPORTS---------------------------------*/

@Entity
public class ServiceFacturation implements Serializable {

/*---------------------------------ATTRIBUTS----------------------------------*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idServiceFacturation;
    
    private String email, password;

/*-------------------------------FIN ATTRIBUTS--------------------------------*/
    
/*-------------------------------CONSTRUCTEURS--------------------------------*/
    
//Constructeur par défault
    
    public ServiceFacturation() {
        this.email = "";
        this.password = "";
    }
    
//Constructeur par valeurs
    
    public ServiceFacturation(String email) {
        this.email = email;
        this.password = "guest";
    }    
    
/*-----------------------------FIN CONSTRUCTEURS------------------------------*/
    
/*----------------------------------METHODES----------------------------------*/
/*----------------------------------Getters-----------------------------------*/
    
    public Long getId() {
        return idServiceFacturation;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
/*----------------------------------Setters-----------------------------------*/
   
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
/*-----------------------------------Others-----------------------------------*/
    
    //Changer l'email du compte du ServiceFacturation
    public void changerEmail(String email) {
        ServicesImpl services = new ServicesImpl();
        ServiceFacturation sF = services.findServiceFacturationById(this.idServiceFacturation);
        sF.setEmail(email);
        services.miseAJourServiceFacturation(sF);
    }
    
    //Changer le mot de passe du compte de l'employe
    public void changerPassword(String password) {
        ServicesImpl services = new ServicesImpl();
        ServiceFacturation sF = services.findServiceFacturationById(this.idServiceFacturation);
        sF.setPassword(password);
        services.miseAJourServiceFacturation(sF);
    }

/*---------------------------------Surcharges---------------------------------*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServiceFacturation != null ? idServiceFacturation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServiceFacturation)) {
            return false;
        }
        ServiceFacturation other = (ServiceFacturation) object;
        if ((this.idServiceFacturation == null && other.idServiceFacturation != null) || (this.idServiceFacturation != null && !this.idServiceFacturation.equals(other.idServiceFacturation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modele.ServiceFacturation[ id service facturation=" + idServiceFacturation + ", email=" + getEmail() + ", password=" + password + " ]";
    }
    
/*--------------------------------FIN METHODES--------------------------------*/
    
}

                            /*Fin classe ServiceFacturation*/