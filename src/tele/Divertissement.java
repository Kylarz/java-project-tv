/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tele;

/**
 *
 * @author symon.gonthiez
 */
public class Divertissement extends ProgrammeMere {
        public String animateur;
        public int heure_deb;
        public int heure_fin;
        
        
        


public Divertissement (String animateur, int durée, String nom)
{
    super(type, nom, heure);
    this.durée = 2;
    this.animateur = "Bernard";
    this.nom = "Pas_sans_mon_chat";
    this.heure_deb=18; // A redéfinir après selon les autres classes
    this.heure_fin=heure_deb+2;

}
}
