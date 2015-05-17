package com.mycompany.tele;

import java.util.ArrayList;
import java.io.*; // Librairie : http://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html


public class Application
{  
     
        
    public static void main( String[] args )          // Programme principal. 
    {
        
                                  // déclaration d'un tableau 'Grilletele' de String
        ProgrammeMere Tabprog[] = new ProgrammeMere [50];
        int Grilletele[] = new int [24];
        String Tabnom[] = new String [50];
        
        
                          // Le tableau Grilletele prend 24 emplacements de boolean. 
        
        System.out.println( "Bienvenue, voici la liste des programmes :" );
        
        ArrayList<String> programmeList = new ArrayList();
        
// ---------------------------------------- Zone d'ajout des programmes ------------------------------------------------
        
        programmeList.add("fiction, 21, 2, Jurrasic World, 2001, Steven Spielberg, oui");
        programmeList.add("divertissement, 12, toto, titi");
        programmeList.add("reportage, 0, 3, Enquête d'action, culturel");
        programmeList.add("reportage, 2, 3, Au coeur d'une friterie, monde");
        programmeList.add("FICTION, 10, 2, Interstellar, 2015, Christopher Nolan, OUI");
        programmeList.add("divertiSSement, 12, Vendreditoutestpermis, Arthur");
        
       for (int i = 0; i< Grilletele.length;i++) {
           Grilletele[i]=0;
           
       } 
       
       
        for (int i = 0; i < programmeList.size(); i++ ) {                                         // Pour tout les programmes ajoutés précedemment, on les trie
            
            String[] TSplitted = programmeList.get(i).split(",");
            if (TSplitted[0].equalsIgnoreCase("Divertissement")) {              // si le premier champ est équivalent à "Divertissement", alors on ajoute ce programme dans la liste des divertissements. 
               Tabprog[i]= new Divertissement("Divertissement", Integer.parseInt(TSplitted[1].trim()),TSplitted[2],TSplitted[3]);
               
               for (int j = Tabprog[i].heure; j < Tabprog[i].heure+Tabprog[i].duree; j++) {
                   Tabnom[j]= Tabprog[i].nom;
                   Grilletele[j]=Grilletele[j]+1;
               }
               }
               
            
            
            
            if (TSplitted[0].equalsIgnoreCase("Fiction")) {                     // si le premier champ est équivalent à "Fiction", alors on ajoute ce programme dans la liste des fictions. 
                Tabprog[i]=new Fiction("Fiction", Integer.parseInt(TSplitted[1].trim()), Short.parseShort(TSplitted[2].trim()),TSplitted[3], Short.parseShort(TSplitted[4].trim()), TSplitted[5], Boolean.parseBoolean(TSplitted[6].trim()));
                for (int j = Tabprog[i].heure; j < Tabprog[i].heure+Tabprog[i].duree; j++) {
                    Tabnom[j]= Tabprog[i].nom;
                   Grilletele[j]=1;
            }
                }
            
            if (TSplitted[0].equalsIgnoreCase("Reportage")) {                   // si le premier champ est équivalent à "Reportage", alors on ajoute ce programme dans la liste des reportages. 
                Tabprog[i]=new Reportage("Reportage", Integer.parseInt(TSplitted[1].trim()), Short.parseShort(TSplitted[2].trim()),TSplitted[3], TSplitted[4]);
                for (int j = Tabprog[i].heure; j < Tabprog[i].heure+Tabprog[i].duree; j++) {
                   Tabnom[j]= Tabprog[i].nom;
                   Grilletele[j]=Grilletele[j]+1;
                        }   // la méthode .trim() permet, entre deux champs, de ne pas prendre en compte les espaces. 
                             }
            
            
            
        
            }
        
        System.out.println("Voici le programme TV de la journée :");
        for (int y = 0; y< Grilletele.length;y++) {
            
            if (Tabnom[y] == null) {
                System.out.println(" Ce créneau est vide " + y + "h " + Grilletele[y]);
            }
            else if (Tabnom[y] != null) {
                
            
            System.out.println(Tabnom[y] +" Est diffusé dans le créneau " + y + "h " + Grilletele[y]);
  
                    }
            
            if (Grilletele[y] == 2) {
                System.out.println("SUPERPOSITION DETECTED ERROR : Il y'a une superposition de programme !");
            }
        
        }
        
        
        }
}

                // Après vérification de l'énoncé, seul les programmes de types divertissement et fiction peuvent se croiser
             



