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
    public Short duree;
    
    
    
public Reportage (String type, int heure, String nom, String theme)    {
    
    
    super(type, heure, nom);
    this.theme = theme;
    this.duree= duree;
}

// Get de la classe à faire

public String toString() {
    
    return String.format ("Fiction -> [Type=/s, Nom=%s, Heure=%s, Durée=%s, Theme=%s, HeureFin=%s]", type, nom, heure, duree, theme, HF());

}
    
    
    
    
}
