package org.example.exo5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compilateur {
    //compter le nombre de ligne qui commence par "if" et se termine par "n"


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

    public static int motifn(String cheminFichier){
        int nbL = 0;

        String contenu = LireFichier(cheminFichier);

        for (String ligne : contenu.split("\n")){
            if (ligne.startsWith("if") && ligne.endsWith("n")){
                nbL++;
            }
        }

        return nbL;
    }

}
