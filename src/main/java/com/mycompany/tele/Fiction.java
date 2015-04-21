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
public class Fiction extends ProgrammeMere {

    public int durée;
    public short année;
    public String nom_realisateur;
    public boolean redif;
    
    
    
    
    public Fiction (String type, int heure,String nom, int durée, short année,  String nom_realisateur, boolean redif) {
        
        super(type,heure,nom);
        this.nom_realisateur= nom_realisateur;
        this.redif = redif;
        
        
    }
}
