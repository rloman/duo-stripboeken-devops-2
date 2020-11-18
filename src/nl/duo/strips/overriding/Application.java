package nl.duo.strips.overriding;

public class Application {

    public static void main(String[] args) {
        Boek b = new Boek();
        b.setTitle("De blauwe wolken");

        System.out.println(b.toString());


    }
}
