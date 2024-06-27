package org.example;

import org.example.exo1.Compilateur;

import java.util.Scanner;

import static org.example.exo1.Compilateur.nbOccure;
import static org.example.exo2.Compilateur.nbOccureMot;
import static org.example.exo4.Compilateur.lexemes;
import static org.example.exo5.Compilateur.motifn;

public class Main {
    public static Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) {

        //exo 1
        /*
        System.out.println("Hello compilateur !!!");

        System.out.println( nbOccure("C:\\Users\\mica\\Desktop\\M1\\TP_Compilation\\src\\main\\java\\org\\example\\exo1\\monfichierTexte.txt"));
        */

        //exo 2
        /*
        System.out.println("Hello compilateur !!!");

        System.out.println("Veuillez entrer le mot dont vous voulez compter les occurances : ");
        String mot = scanner.nextLine();

        System.out.println( nbOccureMot("C:\\Users\\mica\\Desktop\\M1\\TP_Compilation\\src\\main\\java\\org\\example\\exo2\\monfichierTexte.txt",mot));
        scanner.close();
         */

        //exo3
        /*
        System.out.println("Hello compilateur !!!");

        System.out.println( nbOccureAutomate("C:\\Users\\mica\\Desktop\\M1\\TP_Compilation\\src\\main\\java\\org\\example\\exo3\\monfichierTexte.txt"));
        */

        //exo 4
        /*
        System.out.println("Hello compilateur !!!");

        System.out.println("Veuillez entrer votre chaine arithmetique : ");
        String mot = scanner.nextLine();

        System.out.println( lexemes(mot));
        scanner.close();
         */
        //exo5
        System.out.println("Hello compilateur !!!");
        System.out.println( motifn("C:\\Users\\mica\\Desktop\\M1\\TP_Compilation\\src\\main\\java\\org\\example\\exo5\\monfichierTexte.txt"));


    }
}