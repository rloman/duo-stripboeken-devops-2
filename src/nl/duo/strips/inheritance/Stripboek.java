package nl.duo.strips.inheritance;

public class Stripboek {

    protected String title;
    private double price;


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
