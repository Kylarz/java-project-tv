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
        
        ArrayList<Divertissement> list_Diver;
        ArrayList<Fiction> list_Fic;
        ArrayList<Reportage> list_Report;
        boolean Grilletele[]; 
              
        list_Report = new ArrayList<Reportage>();
        list_Fic = new ArrayList<Fiction>();
        list_Diver = new ArrayList<Divertissement>();
        Grilletele = new boolean [24];  
        
        System.out.println( "Bienvenue, voici la liste des programmes :" );
        
        ArrayList<String> programmeList = new ArrayList();
        

        
        programmeList.add("fiction, 21, 2, A.I., 2001, Steven Spielberg, oui");
        programmeList.add("divertissement, 12, toto, titi");
        programmeList.add("reportage, 0, 3, test, culturel");
        programmeList.add("reportage, 2, 3, test, monde");
        programmeList.add("FICTION, 10, 2, A.I., 2001, Steven Spielberg, OUI");
        programmeList.add("divertiSSement, 12, Vendreditoutestpermis, Arthur");


        
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
          
		for (Divertissement d : list_Diver)
		{
			System.out.println(d.toString());
		}
        
                for (Reportage r : list_Report)
		{
			System.out.println(r.toString());
		} 
                
                for (Fiction f : list_Fic)
		{
			System.out.println(f.toString());
		}
                
                for (Fiction f : list_Fic) {
                    for (Divertissement d : list_Diver) {
                        if (d.heure = f.heure)
                    }
                }
                
                // Après vérification de l'énoncé, seul les programmes de types divertissement et fiction peuvent se croiser
             
    }
   }



