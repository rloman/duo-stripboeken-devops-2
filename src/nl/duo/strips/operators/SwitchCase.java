package nl.duo.strips.operators;

import jdk.nashorn.api.tree.BreakTree;

public class SwitchCase {

    public static void main(String[] args) {

        int dagen = geefAantalDagenVanDeMaand(344);

        System.out.println(dagen);

        // gebruik het spaarzaam

        int druiven = 50;

        String label = druiven > 50 ? "Veel druiven" : "Weinig druiven";

        System.out.println(label);

    }

    // mooi voorbeeld
    public static int geefAantalDagenVanDeMaand(int maandNummer) {
        
        int aantalDagenVanDezeMaand;
        
        switch (maandNummer) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                aantalDagenVanDezeMaand = 31;
                break;
                
            case 2:
                aantalDagenVanDezeMaand = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                aantalDagenVanDezeMaand = 30;
                break;

            default:
                aantalDagenVanDezeMaand = -1;
                System.out.println("De maand "+maandNummer+" bestaat niet!");
                break;
        }
        
        return aantalDagenVanDezeMaand;
    }
}
