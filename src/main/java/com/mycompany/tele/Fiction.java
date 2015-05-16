/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tele;                      // package utile au fonctionnement deu programme.

/**
 *
 * 
 */
public class Fiction extends ProgrammeMere {                // Cette classe sert pour les programmes de fictions, elle hérite de la classe programmemere, cette classe est donc "la fille" de la classe mère. 


    public short annee;
    public String nom_realisateur;
    public boolean redif;                                   // Elle prend pour attributs l'année de réalisation, le nom du réalisateur, et si il s'agit d'une rediffusion ou non. 
    
    
    
    
    public Fiction (String type, int heure, short duree, String nom, short annee,  String nom_realisateur, boolean redif) {  // méthode de polymorphisme. 
        
        super(type,heure,duree,nom);
        this.nom_realisateur= nom_realisateur;
        this.redif = redif;
        this.annee = annee;
        this.duree=duree;
        
        
    }

                                    // Déclaration des getters utile à la classe fiction. Ils nous permettront d'accéder aux attributs privés ou protégés de cette classe. 

public int GetDuree () {            // getter de la durée

    return duree;
}

public void SetDuree(short _duree) {
    this.duree=_duree;
} 

public int GetAnnee () {            // getter de l'année de réalisation.

    return annee;
}

public void GetAnnee(short _annee) {
this.annee=_annee;
} 

public String GetNom_Realisateur () {    // getter du nom du réalisateur. 

    return nom_realisateur;
}

public void SetNom_Realisateur(String _nom_realisateur) {
this.nom_realisateur=_nom_realisateur;
} 

public boolean GetRedif () {          // getter de la rediffusion.

    return redif;
}

public void SetNom_Realisateur(boolean _redif) {
this.redif=_redif;
}



public String toString() {              // On retourne une phrase qui nous donne le descriptif complet du programme de fiction diffusé grâce aux getters précedemment déclarés. 
    
    return String.format ("Fiction -> [Type=%s, Heure=%s, Durée=%s, Nom=%s, Année=%s, Nom du réalisateurr=%s, Rediffusion =%s, HeureFin=%sh]", type, heure, duree, nom, annee, nom_realisateur, redif, HF());

}


}