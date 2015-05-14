/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tele;

/**
 *
 * 
 */
public class Fiction extends ProgrammeMere {


    public short annee;
    public String nom_realisateur;
    public boolean redif;
    
    
    
    
    public Fiction (String type, int heure, short duree, String nom, short annee,  String nom_realisateur, boolean redif) {
        
        super(type,heure,nom,duree);
        this.nom_realisateur= nom_realisateur;
        this.redif = redif;
        this.annee = annee;
        this.duree=duree;
        
        
    }



public int GetDuree () {

    return duree;
}

public int GetAnnee () {

    return annee;
}

public String GetNom_Realisateur () {

    return nom_realisateur;
}

public boolean GetRedif () {

    return redif;
}

public String toString() {
    
    return String.format ("Fiction -> [Type=%s, Heure=%s, Durée=%s, Nom=%s, Année=%s, Nom du réalisateurr=%s, Rediffusion =%s, HeureFin=%sh]", type, nom, heure, duree, annee, nom_realisateur, redif, HF());

}


}