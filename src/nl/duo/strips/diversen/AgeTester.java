package nl.duo.strips.diversen;

public class AgeTester {

    public static void main(String[] args) {
        int age = 42;

        System.out.println(age);

        byte test = 2;
        // 0000 0010

        byte test2 = -2;
        // 1000 0010
        // let op: voor de techneuten => in het echt werkt het met 2-complement
        // en staat het bij neg.getallen net andersom
        // => zoiets 1111 1101
        //
    }
}