public class ArraysEnLoops {

    public static void main(String[] args) {


        int[] numbers = {8, 7, 6, 9, 14, 12, 7, 6};

        // print het derde element
        System.out.println(numbers[2]);

        // aanvullend ...

        int[] otherNumbers = new int[3];

        System.out.println(otherNumbers[2]);
        otherNumbers[2] = 15;
        System.out.println(otherNumbers[2]);

        // loop er overheen

        // Basic loop (niets basics aan, want je moet veel doen)
        for(int i = 0;i<numbers.length;i++) {
            System.out.println("Het getal op index: "+i+" is gelijk aan: "+numbers[i]);
        }

        // Enhanced for loop (enhanced, want de computer doet (gelukkig) veel voor ons
        for(int n : numbers) {
            System.out.println("Getal is nu: "+n);
        }
    }
}
