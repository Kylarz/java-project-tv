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
public class ProgrammeMere {
    public String type;
    public int heure;
    public String nom;
    public short duree;
   

public ProgrammeMere (String type, int heure, String nom) {
    
    this.type = type;
    this.heure = heure;
    this.nom=nom;
}

public ProgrammeMere (String type, int heure, String nom, short duree) {
    
    this.type = type;
    this.heure = heure;
    this.nom= nom;
    this.duree= duree;
       
}
        
public String GetType () {

    return type;
}

public int GetHeure () {

    return heure;
}

public String GetNom () {

    return nom;
}

public int HF () { // Fonction déterminant l'heure de fin d'un programme, va servir pour : reportage et fiction
    return heure + duree;
    
}
 
        

        
        
        
        
        
        }
