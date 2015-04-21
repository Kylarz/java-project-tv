/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.tele;

/**
 *
 * @author frederic.gery
 */
public class Reportage extends ProgrammeMere {
    
    public String theme;
    
    
    
public Reportage (String type, int heure, String nom, String theme)    {
    
    
    super(type, heure, nom);
    this.theme = theme;
    
}
    
    
    
    
}
