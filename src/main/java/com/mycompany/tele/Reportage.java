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
public class Reportage extends ProgrammeMere {           // Cette classe sert pour les programmes de reportages, elle hérite de la classe ProgrammeMere, cette classe est donc "la fille" de la classe mère. 
    
    public String theme;                                // Elle prend pour attributs le thème du reportage, plus ceux de la classe mère.

public Reportage (String type, int heure, short duree, String nom, String theme)    {
    
    
    super(type,heure,duree, nom);                     // La méthode super () est expliqué dans divertissement.java. Ici, on récupère le type, l'heure, le nom et la durée de la classe mère. 
    this.theme = theme;
    this.duree= duree;
}

                                    //  Déclaration des getters utile à la classe reportage. Ils nous permettront d'accéder aux attributs privés ou protégés de cette classe. 

public String GetTheme() {          // getter du thème du reportage. 
    
    return theme;
}

public short GetDuree() {           // getter de la durée. 
    
    return duree;
}




public String toString() {          // On retourne une phrase qui nous donne le descriptif complet du programme de reportage diffusé grâce aux getters précedemment déclarés.
    
    return String.format ("Reportage -> [Type=%s, Heure=%s, Durée=%s, Nom=%s, Thème=%s, Heure de Fin=%sh]", type, heure, duree, nom, theme, HF());

}
    
    
    
    
}
