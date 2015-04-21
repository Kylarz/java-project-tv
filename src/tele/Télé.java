/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tele;

import java.util.Date;

/**
 *
 * @author symon.gonthiez
 */
public class Télé {
    

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) { // Array List String + Split
        ProgrammeMere[] TableauChaines;
        TableauChaines = new ProgrammeMere[15];
        
        Date date = new Date();
        
        Divertissement d;
        
        d = new Divertissement("Bernard", 2, "pas_sans_mon_chat");
        System.out.println("Retrouvez notre cher " + d.animateur + " Dans : " + d.nom + " entre " + d.heure_deb + "h - " + d.heure_fin + "h");
        // TODO code application logic here
    }
    
}
