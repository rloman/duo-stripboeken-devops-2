package nl.duo.strips.overriding;

// erft impliciet van 'Object'
public class Boek {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Override!!!
    @Override
    public String toString() {
        return "Het boek heet: " + this.title;
    }
}
