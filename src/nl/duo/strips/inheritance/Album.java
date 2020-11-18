package nl.duo.strips.inheritance;

public class Album extends Stripboek {

    private String uitgever;

    public String getUitgever() {
        return uitgever;
    }

    public void setUitgever(String uitgever) {
        this.uitgever = uitgever;
    }

    @Override
    public String getAantalKeerGelezen() {
        return "43";
    }

    @Override
    public void readMe() {
        System.out.println("Reading Album");
    }
}
