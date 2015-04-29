package com.mycompany.tele;

import java.util.ArrayList;
import java.io.*; // Librairie : http://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html

/**
 * Hello world!
 *
 */
public class Application 
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenue" );
        ProgrammeMere[] TableauChaines;
        TableauChaines = new ProgrammeMere[15];
        
        ArrayList<String> programmeList = new ArrayList();
        
        programmeList.add("fiction, 21, 2, A.I., 2001, Steven Spielberg, oui");
        programmeList.add("Divertissement, 12, toto, titi");
        programmeList.add("reportage, 0, 3, test, culturel");
        programmeList.add("reportage, 2, 3, test, monde");
        programmeList.add("fiction, 10, 2, A.I., 2001, Steven Spielberg, oui");
        programmeList.add("fiction, 10, 2, A.I., 2001, Steven Spielberg, oui");

        // d'autres programmes à ajouter


        // A vous de traiter programmeList pour construire votre grille de programme

        // L'objet String sera votre ami pour traiter facilement la chaine de caractères


    
        
       // d = new Divertissement("Bernard", 2, "pas_sans_mon_chat");
        //System.out.println("Retrouvez notre cher " + d.animateur + " Dans : " + d.nom + " entre " + d.heure_deb + "h - " + d.heure_fin + "h");
        // TODO code application logic here
    }
}


