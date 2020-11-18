package nl.duo.strips.operators;

public class Operators {

    public static void main(String[] args) {

        // Basisschool
        System.out.println(3+4);
        System.out.println(3-4);
        System.out.println(3*4); // asterisk (*) is vermenigvuldigen
        System.out.println(12/4); // '/' is delen


        int myAge = 52; // definieer
        // jarig
        myAge = myAge + 1; // gebruik

        System.out.println(myAge);

        // postfix increment
        // om iets met 1 te verhogen

        System.out.println(myAge++);
        System.out.println(myAge);

        System.out.println(++myAge);
        System.out.println(++myAge);
        System.out.println(++myAge);

        System.out.println(myAge);
        myAge++;


        int otherAge = 0;

        // dit
        otherAge = otherAge + 2;
        // is hetzelfde als
        otherAge += 2;

        //dit
        otherAge = otherAge *3;
        // is hetzelfde als
        otherAge *= 3;

        // Modulus operator
        // rest na deling of ook wel : remainder

        int aantal = 43;
        int deler = 15;

        int aantalGedeeldDoorDeler = aantal/deler;

        System.out.println(aantalGedeeldDoorDeler);

        int rest = aantal % deler;

        System.out.println(rest);


        //
    }
}
