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

public Reportage (String type, int heure, String nom, String theme, short duree)    {
    
    
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
    
    return String.format ("Fiction -> [Type=/s, Nom=%s, Heure=%s, Durée=%s, Theme=%s, HeureFin=%s]", type, nom, heure, duree, theme, HF());

}
    
    
    
    
}
