package nl.duo.strips.constructors;

public class Application {

    public static void main(String[] args) {

        Student saskia = new Student("Saskia", 22);

        System.out.println(saskia.getName());
        System.out.println(saskia.getAge());
    }
}
