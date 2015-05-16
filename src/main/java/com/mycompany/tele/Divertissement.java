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
public class Divertissement extends ProgrammeMere {             // Cette classe sert pour les programmes de divertissements, elle hérite de la classe programmemere, cette classe est donc "la fille" de la classe mère.  
        public String nom_animateur;                            // elle prend pour simple attribut le nom de l'animateur, plus ceux de la classe mère. 

       

public Divertissement (String type, int heure, String nom, String nom_animateur)
{
    super(type, heure, nom);                                    // super() sert à appeler les constructeurs de type, heure et nom de la classe mère ProgrammeMere. Ceci est rendu nécessaire lorsque qu'on déclare une classe étendant une autre classe, et que celle-ci ne possède pas de constructeur avec les mêmes arguments.
    this.nom_animateur = nom_animateur;

}

public String GetNom_Animateur() {                              // getter du nom du réalisateur. 

    return nom_animateur;
}

public void SetDuree(String _nom_animateur) {
    this.nom_animateur=_nom_animateur;
} 


public int HeureFin() {                     // Divertissement à sa propre fonction heurefin, car pas de variable durée.
    
    return heure + 2;
}






public String toString() {              // On retourne une phrase qui nous donne le descriptif complet du programme de divertissement diffusé grâce aux getters précedemment déclarés.
    
    return String.format ("Divertissement -> [Type=%s, Heure=%s, Nom=%s, Durée=%s, Animateur=%s, HeureFin=%sh]", type, heure, nom,2, nom_animateur, HeureFin());
    
}


}
    
    
    
    


