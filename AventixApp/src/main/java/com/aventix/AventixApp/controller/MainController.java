/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aventix.AventixApp.controller;
 
import com.aventix.AventixApp.modele.Employe;
import com.aventix.AventixApp.services.ServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
 
    @RequestMapping(value = { "/employe" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        ServicesImpl services = new ServicesImpl();
        Employe e =  new Employe("Vivian", "Wong", "Villeurbanne", "vivian.wong@insa-lyon.fr");
        services.referencerEmploye(e);
        
        String nom = services.findEmployeById(e.getId()).getNom();
        String prenom = services.findEmployeById(e.getId()).getPrenom();
        String statut = services.findEmployeById(e.getId()).getClass().getName().replaceFirst("com.aventix.AventixApp.modele.", "");
 
        model.addAttribute("nom", nom);
        model.addAttribute("prenom", prenom);
        model.addAttribute("statut", statut);
 
        return "indexEmploye";
    }
    
    @RequestMapping(value = { "/test" }, method = RequestMethod.GET)
    public String indexEmploye() {
        return "indexEmploye";
    }
 
}