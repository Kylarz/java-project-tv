package com.mycompany.tele;

import java.util.ArrayList;
import java.io.*; // Librairie : http://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html


public class Application
{  
     
        
    public static void main( String[] args )          // Programme principal. 
    {
        
        ArrayList<Divertissement> list_Diver;           // Création d'un conteneur ArrayList. Implémente donc un tableau d'objet pour les divertissements. 
        ArrayList<Fiction> list_Fic;                    // Création d'un conteneur ArrayList. Implémente donc un tableau d'objet pour les fictions. 
        ArrayList<Reportage> list_Report;               // Création d'un conteneur ArrayList. Implémente donc un tableau d'objet pour les reportages. 
        boolean Grilletele[];                           // déclaration d'un tableau 'Grilletele' de boolean
              
        list_Report = new ArrayList<Reportage>();
        list_Fic = new ArrayList<Fiction>();
        list_Diver = new ArrayList<Divertissement>();
        Grilletele = new boolean [24];                  // Le tableau Grilletele prend 24 emplacements de boolean. 
        
        System.out.println( "Bienvenue, voici la liste des programmes :" );
        
        ArrayList<String> programmeList = new ArrayList();
        
// ---------------------------------------- Zone d'ajout des programmes ------------------------------------------------
        
        programmeList.add("fiction, 21, 2, A.I., 2001, Steven Spielberg, oui");
        programmeList.add("divertissement, 12, toto, titi");
        programmeList.add("reportage, 0, 3, test, culturel");
        programmeList.add("reportage, 2, 3, test, monde");
        programmeList.add("FICTION, 10, 2, A.I., 2001, Christopher Nolan, OUI");
        programmeList.add("divertiSSement, 12, Vendreditoutestpermis, Arthur");


        
        for (String s :programmeList) {                                         // Pour tout les programmes ajoutés précedemment, on les trie
            
            String[] TSplitted = s.split(",");
            if (TSplitted[0].equalsIgnoreCase("Divertissement")) {              // si le premier champ est équivalent à "Divertissement", alors on ajoute ce programme dans la liste des divertissements. 
                
                list_Diver.add(new Divertissement("Divertissement", Integer.parseInt(TSplitted[1].trim()),TSplitted[2],TSplitted[3]));
              
            }
            
            if (TSplitted[0].equalsIgnoreCase("Fiction")) {                     // si le premier champ est équivalent à "Fiction", alors on ajoute ce programme dans la liste des fictions. 
                list_Fic.add(new Fiction("Fiction", Integer.parseInt(TSplitted[1].trim()), Short.parseShort(TSplitted[2].trim()),TSplitted[3], Short.parseShort(TSplitted[4].trim()), TSplitted[5], Boolean.parseBoolean(TSplitted[6].trim())));
              
            }
            
            if (TSplitted[0].equalsIgnoreCase("Reportage")) {                   // si le premier champ est équivalent à "Reportage", alors on ajoute ce programme dans la liste des reportages. 
                list_Report.add(new Reportage("Reportage", Integer.parseInt(TSplitted[1].trim()), Short.parseShort(TSplitted[2].trim()),TSplitted[3], TSplitted[4]));
              
            }                   // la méthode .trim() permet, entre deux champs, de ne pas prendre en compte les espaces. 
        }
          
		for (Divertissement d : list_Diver)             // pour tout les programmes de divertissements, on les affiche grâce à la méthode tostring qui vient de divertissement.java
		{
			System.out.println(d.toString());
		}
        
                for (Reportage r : list_Report)                 // pour tout les programmes reportages, on les affiche grâce à la méthode tostring qui vient de reportage.java
		{
			System.out.println(r.toString());
		} 
                
                for (Fiction f : list_Fic)                      // pour tout les programmes de fiction, on les affiche grâce à la méthode tostring qui vient de fiction.java
		{
			System.out.println(f.toString());
		}
                
      
                
                
                
                
               
                
               
                
                // Après vérification de l'énoncé, seul les programmes de types divertissement et fiction peuvent se croiser
             
    }
}

