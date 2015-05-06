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
        System.out.println( "Bienvenue, voici la liste des programmes :" );
        ProgrammeMere[] TableauChaines;
        TableauChaines = new ProgrammeMere[15];
        
        ArrayList<Divertissement> list_Diver = new ArrayList();
        ArrayList<Fiction> list_Fic = new ArrayList();
        ArrayList<Reportage> list_Report = new ArrayList();
        
        ArrayList<String> programmeList = new ArrayList();
        
        programmeList.add("fiction, 21, 2, A.I., 2001, Steven Spielberg, oui");
        programmeList.add("divertissement, 12, toto, titi");
        programmeList.add("reportage, 0, 3, test, culturel");
        programmeList.add("reportage, 2, 3, test, monde");
        programmeList.add("FICTION, 10, 2, A.I., 2001, Steven Spielberg, OUI");
        
        for (String s :programmeList) {
            
            
            
            String[] TSplitted = s.split(",");
            if (TSplitted[0].equalsIgnoreCase("Divertissement")) {
                list_Diver.add(new Divertissement("Divertissement", Integer.parseInt(TSplitted[1].trim()),TSplitted[2],TSplitted[3]));
              
            }
            
            if (TSplitted[0].equalsIgnoreCase("Fiction")) {
                list_Fic.add(new Fiction("Fiction", Integer.parseInt(TSplitted[1].trim()), Short.parseShort(TSplitted[2].trim()),TSplitted[3], Short.parseShort(TSplitted[4].trim()), TSplitted[5], Boolean.parseBoolean(TSplitted[6].trim())));
              
            }
            
            if (TSplitted[0].equalsIgnoreCase("Reportage")) {
                list_Report.add(new Reportage("Reportage", Integer.parseInt(TSplitted[1].trim()), Short.parseShort(TSplitted[2].trim()),TSplitted[3], TSplitted[4]));
              
            }
            
            
            
            
                
            
         
            
            
            
            
        }
        
        
        
        
        
        // d'autres programmes à ajouter


        // A vous de traiter programmeList pour construire votre grille de programme

        // L'objet String sera votre ami pour traiter facilement la chaine de caractères

    }
}


