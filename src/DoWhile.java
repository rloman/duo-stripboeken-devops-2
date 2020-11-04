public class DoWhile {

    public static void main(String[] args) {


        // alle paddestoelen kun je eten ...
        // sommige zelfs vaker dan 1x

        // de do...while wordt 1x of vaker uitgevoerd

        int aantalDruiven = 100;

        do {
            System.out.println("Het aantal druiven is "+aantalDruiven);
            aantalDruiven++;
        }
        while(aantalDruiven < 50);
    }
}
