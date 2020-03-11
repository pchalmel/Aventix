                        /*Interface Services ServiceFacturation*/
package com.aventix.AventixApp.services;

/*---------------------------------IMPORTS------------------------------------*/

import com.aventix.AventixApp.modele.ServiceFacturation;

/*--------------------------------FIN IMPORTS---------------------------------*/

public interface ServicesServiceFacturation {
    
    public void referencerServiceFacturation(ServiceFacturation sF);
    public void dereferencerServiceFacturation(ServiceFacturation sF);
    public void miseAJourServiceFacturation(ServiceFacturation sF);
    public ServiceFacturation findServiceFacturationByEmail(String email);
    public ServiceFacturation findServiceFacturationById(Long idServiceFacturation);
}

                    /*Fin Interface Services ServiceFacturation*/