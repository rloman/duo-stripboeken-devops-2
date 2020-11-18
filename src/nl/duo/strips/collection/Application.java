package nl.duo.strips.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

    public static void main(String[] args) {

        {
            // ArrayList
            ArrayList<String> names = new ArrayList<>();

            names.add("Ray");
            names.add("Martin");
            names.add("Klaas");

            System.out.println("Voor het sorteren");
            for(String eenNaam : names) {
                System.out.println(eenNaam);
            }

            Collections.sort(names);


            System.out.println("Na het sorteren");
            for(String eenNaam : names) {
                System.out.println(eenNaam);
            }
        }


        {
            HashSet<String> names = new HashSet<>();
            HashSet<Integer> numbers = new HashSet<Integer>();

            names.add("Ray");
            names.add("Martin");
            names.add("Klaas");

            for(String eenNaam : names) {
                System.out.println(eenNaam);
            }


            // sorteren niet mogelijk
            /*
            System.out.println("Na het sorteren");
            for(String eenNaam : names) {
                System.out.println(eenNaam);
            }
             */
        }






    }

}
