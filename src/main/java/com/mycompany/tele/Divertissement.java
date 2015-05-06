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
public class Divertissement extends ProgrammeMere {
        public String nom_animateur;

       

public Divertissement (String type, int heure, String nom, String nom_animateur)
{
    super(type, heure, nom);
    this.nom_animateur = nom_animateur;

}

public String GetNom_Animateur() {

    return nom_animateur;
}


public int HeureFin() { // Divertissement à sa propre fonction heurefin car pas de variable durée.
    
    return heure + 2;
}






public String toString() {
    
    return String.format ("Divertissement -> [Type=%s, Heure=%s, Nom=%s, Durée=%s, Animateur=%s, HeureFin=%s]", type, heure, nom,2, nom_animateur, HeureFin());
    
}


}
    
    
    
    


