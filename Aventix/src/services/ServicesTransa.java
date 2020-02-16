                        /*Interface Services Transa*/
package services;

/*---------------------------------IMPORTS------------------------------------*/

import java.util.Date;
import java.util.List;
import modele.Transa;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesTransa {
    
    public void referencerTransa(Transa t);
    public void dereferencerTransa(Transa t);
    public void miseAJourTransa(Transa t);
    public List<Transa> findAllTransas();
    public List<Transa> findTransaByDate(Date dateTransa);
    public List<Transa> findTransaByIdCarte(Long idCarte);
    public Transa findTransaById(Long idTransa);
}

                    /*Fin Interface Services Transa*/