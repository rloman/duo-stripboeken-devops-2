package nl.duo.strips.oo.methods;

public class Drukpers {
    /*
    - maak alle fields private
    - Genereer daarna via Rechtermuisknop in het java bestand /
                Generate ... / Getters and Setters voor elk
                field de getter en de setter

    - Pas jouw Application::main aan zodat het weer werkt.
     */

    private int aantalKerenGedrukt;
    private String manufacturer;

    public void press() {
        aantalKerenGedrukt++;
    }

    public int getAantalKerenGedrukt() {
        return aantalKerenGedrukt;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
// method, nederlands: Methode (zie press hieronder)
    /* Syntax:

    <accessmod: wie kan er bij>
    <return type (het type van het resultaat: int, String,
            en als er geen resultaat is: dan 'void'>
    <naam van de methode>
    <parameter lijst>, beginnend en eindigent met ronde haken (...)

    en dan de body van de methode, => de actie, binnen {...}
     */