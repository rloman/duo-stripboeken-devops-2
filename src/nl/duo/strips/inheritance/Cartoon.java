package nl.duo.strips.inheritance;

import nl.duo.strips.inheritance.Stripboek;

public class Cartoon extends Stripboek {

    private int aantalPaginas;

    public int getAantalPaginas() {
        return aantalPaginas;
    }

    public void setAantalPaginas(int aantalPaginas) {

        this.title = "Frans";
        this.aantalPaginas = aantalPaginas;
    }
}
