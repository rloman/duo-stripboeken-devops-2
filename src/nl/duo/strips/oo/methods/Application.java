package nl.duo.strips.oo.methods;

public class Application {

    public static void main(String[] args) {
        Drukpers pers = new Drukpers();

        pers.setManufacturer("Philips");

        System.out.println(pers.getAantalKerenGedrukt());

        pers.press();
        pers.press();
        pers.press();

        System.out.println(pers.getManufacturer());



        System.out.println(pers.getAantalKerenGedrukt());
    }
}
