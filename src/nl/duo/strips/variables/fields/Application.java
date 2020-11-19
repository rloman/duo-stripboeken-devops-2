package nl.duo.strips.variables.fields;

public class Application {

    public static void main(String[] args) {

        // Dit is al bekend
        // Een locale variabele MOET JE ZELF EEN WAARDE geven
        int a = 52;
        System.out.println(a);

        // Dit is dan nieuw maar het principe is hetzelfde ...
        Cartoon donald = new Cartoon();

        donald.titel = "Donald Duck";

        System.out.println(donald.aantalPaginas);
        System.out.println(donald.price);

        char[] numbers = new char[3];
        System.out.println(">>"+numbers[1]+"<<");

    }
}
