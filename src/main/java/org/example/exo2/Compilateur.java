package org.example.exo2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compilateur {

    //lire un fichier.txt et stocker son contenu dans une variable

    //compter le nombre d'occurance de la chaine entré en parametre

    //return


    public static String LireFichier(String cheminFichier){
        StringBuilder contenu = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))){
            String ligne;
            while ((ligne = reader.readLine()) != null){
                contenu.append(ligne).append("\n");
            }
        }catch (IOException e){
            System.out.println("Erreur lors de la lecture du fichier : "+e.getMessage());
            return "";
        }
        return contenu.toString();
    }

    public static int nbOccureMot(String cheminFichier, String mot){
        int nbO = 0;

        String[] contenu = (LireFichier(cheminFichier)).split("\\s+");

        for (String m :contenu){
            if (m.equalsIgnoreCase(mot)){
                nbO++;
            }
        }


        return nbO;
    }

}
