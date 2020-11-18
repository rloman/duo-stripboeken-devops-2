package nl.duo.strips.oo.methods;

public class Application {

    public static void main(String[] args) {
        Drukpers pers = new Drukpers();

        System.out.println(pers.aantalKerenGedrukt);
        pers.press();
        pers.press();
        pers.press();
        System.out.println(pers.aantalKerenGedrukt);
    }
}
