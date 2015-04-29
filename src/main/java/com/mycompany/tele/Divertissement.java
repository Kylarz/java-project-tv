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







public String toString() {
    
    return String.format ("Divertissement -> [Type=/s, Nom=%s, Heure=%s, Durée=%s, Animateur=%s, HeureFin=%s]", type, nom, heure,2, nom_animateur, HF()); // Fonction HF dans l'affichage dans la méthode a tester, et à coder aussi. Le "2" est aussi à tester.
    
}


}
    
    
    
    


