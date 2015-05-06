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
        programmeList.add("divertissement, 12, toto, titi");
        programmeList.add("reportage, 0, 3, test, culturel");
        programmeList.add("reportage, 2, 3, test, monde");
        programmeList.add("FICTION, 10, 2, A.I., 2001, Steven Spielberg, OUI");
        
        
        
        // d'autres programmes à ajouter


        // A vous de traiter programmeList pour construire votre grille de programme

        // L'objet String sera votre ami pour traiter facilement la chaine de caractères

    }
}


