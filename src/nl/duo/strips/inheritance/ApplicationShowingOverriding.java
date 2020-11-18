package nl.duo.strips.inheritance;

public class ApplicationShowingOverriding {

    public static void main(String[] args) {
        Stripboek s = new Stripboek();
        s.readMe();

        Album a = new Album();
        a.readMe();
    }
}
