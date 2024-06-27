package org.example.exo4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Compilateur {
    //retourner les lexemes d'une chaine arithmetique
    // exemple : 21+12*45 => <int:21><operateur:+><int:12><operateur:*><int:45>


    public static Map<String,String> lexemes(String chaineArithmetique){
        int i=0;

        Map<String,String> lexeme = new HashMap<>();

        String[] contenu = (chaineArithmetique).split("\\s+");
        while (i < contenu.length){
            if (contenu[i].equals("+") || contenu[i].equals("*") || contenu[i].equals("-") || contenu[i].equals("/") ){
                lexeme.put(contenu[i],"Operateur");
            }else{
                lexeme.put(contenu[i],"Int");
            }
            i++;
        }
        return lexeme;
    }

}
