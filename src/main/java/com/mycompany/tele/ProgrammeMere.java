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
abstract class ProgrammeMere {                                          // cette classe sera la classe mère et servira pour les autres classes filles. 
    public String type;
    public int heure;
    public String nom;
    public short duree;                                                 // elle prend pour attributs le type de programme, l'heure, le nom, ainsi que la durée. 
   

public ProgrammeMere (String type, int heure, String nom) {             // méthode de polymorphisme
    
    this.type = type;
    this.heure = heure;
    this.nom=nom;
}

public ProgrammeMere (String type, int heure,short duree, String nom) { 
    
    this.type = type;
    this.heure = heure;
    this.nom= nom;
    this.duree= duree;
       
}
   
                // déclaration des getters. Ils permettent d'accéder aux attributs protégées ou privées de la classe. Les mettrent dans la classe abstraite permet de fournir ces accesseurs à toutes les classes filles. On n'a pas besoin de les redéfinir. 
        
public String GetType () {              // getter du type.

    return type;
}

public int GetHeure () {                // getter de l'heure.

    return heure;
}

public String GetNom () {               // getter du nom. 

    return nom;
}

public int HF () { // Fonction déterminant l'heure de fin d'un programme, va servir pour : reportage et fiction
    return heure + duree; 
}
 
        

        
        
        
        
        
        }
