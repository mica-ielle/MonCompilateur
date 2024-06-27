package org.example.exo3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compilateur {
    //se servire de la definition d'un automate

    /*
     * un automate
     * A = (alphabet, ensemble fini d'états, état initial, ensembles des états finaux, fonction de transition)
     * */

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

    public static int nbOccureMotAutomate(String cheminFichier, String mot){
        int nbO = 0;
        int i=0,j=0;
        boolean trouve = true;

        String[] contenu = (LireFichier(cheminFichier)).split("\\s+");

        while (i<contenu.length){
            if(contenu[i].length() == mot.length()){

                while (j<mot.length() && trouve){

                    if ((contenu[i].charAt(j)) == (mot.charAt(j))){
                        j++;
                    }else {
                        trouve = false;
                    }
                }

                if (trouve == true){
                    nbO++;
                }

                trouve=true;
                j=0;
            }
            i++;
        }

        return nbO;
    }

}
