package nl.duo.strips.inheritance;

public class Application {

    public static void main(String[] args) {

        Cartoon donald = new Cartoon();

        donald.setTitle("Donald");

        //

        ZomerAlbum a = new ZomerAlbum();

        a.setMinimumLeeftijd(15);
        a.setTitle("De blauwe wolken");

        System.out.println(a.getMinimumLeeftijd());
        System.out.println(a.getTitle());

    }
}
