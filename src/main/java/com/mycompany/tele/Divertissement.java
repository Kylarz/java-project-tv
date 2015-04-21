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



public int HF () // Fonction déterminant l'heure de fin d'un programme
        
              
{

}
}
    
    
    
    


