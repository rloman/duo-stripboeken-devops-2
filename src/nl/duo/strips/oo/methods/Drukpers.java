package nl.duo.strips.oo.methods;


// method, nederlands: Methode (zie press hieronder)
    /* Syntax:

    <accessmod: wie kan er bij>
    <return type (het type van het resultaat: int, String,
            en als er geen resultaat is: dan 'void'>
    <naam van de methode>
    <parameter lijst>, beginnend en eindigent met ronde haken (...)

    en dan de body van de methode, => de actie, binnen {...}
     */
public class Drukpers {

    int aantalKerenGedrukt = 0;

    public void press() {
        aantalKerenGedrukt++;
    }
}
