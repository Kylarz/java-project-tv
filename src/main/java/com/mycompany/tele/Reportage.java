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
public class Reportage extends ProgrammeMere {
    
    public String theme;

public Reportage (String type, int heure, short duree, String nom, String theme)    {
    
    
    super(type, heure, nom, duree);
    this.theme = theme;
    this.duree= duree;
}

// Get de la classe à faire

public String GetTheme() {
    
    return theme;
}

public short GetDuree() {
    
    return duree;
}




public String toString() {
    
    return String.format ("Reportage -> [Type=%s, Heure=%s, Durée=%s, Nom=%s, Thème=%s, Heure de Fin=%s]", type, nom, heure, duree, theme, HF());

}
    
    
    
    
}
