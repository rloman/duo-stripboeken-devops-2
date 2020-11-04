public class IfElse {

    public static void main(String[] args) {

        // if else

        // Syntax en Structuur

        /*

        if (conditionele expressie) {
            // block met 1 of meerdere statements
        }
        // eventueel
        else {
            // block met 1 of meerdere statements
        }
         */

        // Voorbeeld
        int age = 55; // age is hiernormaliter ontvangen via een web formulier!!!

//        int age = Integer.parseInt(args[0]);



        boolean is40 = age <= 40;

        if(is40) {
            System.out.println("U bent junior!");

            System.out.println("U bent dus jonger dan 40");
            System.out.println("En dit is de laatste regel in het if block");

            if(age < 15) {
                System.out.println("U bent superjong");
            }
        }
        else {
            System.out.println("U bent medior+");
            System.out.println("U bent dus ouder of gelijk aan 40 jaar");
            if(age > 67) {
                System.out.println("U bent pensioengerechtigd!");
            }
        }

        // korte variant (met ander gevolg, dus niet exact hetzelfde als hierboven)
        if(age < 40)
            System.out.println("U bent junior!");
        else if(age > 50)
            System.out.println("I bent medior+");
    }
}
