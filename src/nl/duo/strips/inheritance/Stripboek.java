package nl.duo.strips.inheritance;

public class Stripboek {

    protected String title;
    private double price;

    // Wet
    // Een override van een methode heeft ALTIJD hetzelfde returntype als zijn oorspronkelijke parent method
    public String getAantalKeerGelezen() {
        return "42";
    }


    public void readMe() {
        System.out.println("Reading Stripboek ...");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
