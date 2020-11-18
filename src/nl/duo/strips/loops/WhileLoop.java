package nl.duo.strips.loops;

public class WhileLoop {


    public static void main(String[] args) {


        int aantalDruiven = 0;

        // een while wordt altijd 0 of vaker uitgevoerd
        while (aantalDruiven < 50) {
            aantalDruiven++;
            if(aantalDruiven == 13) {
                // 13 druiven is raar ...
                continue; // eigenlijk is break en continue een soort van 'GOTO programming' => ongestructureerd
            }
            System.out.println(aantalDruiven);
        }
















        // pseudo code ... beetje uitleggend

        // busy wait (dus in het wild niet doen, maar voor antwoord ok voor nu ...)
        /*


        while(queue.isEmpty()) {
            // sleep
//            Thread.sleep(3600000);

        }
        verwerk(queue.getAbonnee());
         */

        // einde while loop

    }
}
