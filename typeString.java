package mesPremiersProgramme;

import java.util.Locale;

public class typeString {


    public static void main(String[] args) {

      String first = "toto";
        String temp = "to";
        String second = temp + temp;
        String third  = first;
        String fourth = "toto";
            System.out.println( first==second);
            System.out.println( first.equals(second) );
            System.out.println( first.equals(third));
            System.out.println( first==fourth);
            System.out.println( first.equals(fourth));
            System.out.println( first.equals("java"));
        String original = "Diego De La Vega";
        String transformation = original.toUpperCase();

        System.out.println( transformation );                       // Affiche : DIEGO DE LA VEGA
       System.out.println( "Compact Sample".toLowerCase() );

        String c [] = original.split("de");
        System.out.println(c[0]);
        System.out.println(c[1]);


        String message = "This is a String with Unicode characters (\u03c0)";
        System.out.println( message );

        String upper = message.toUpperCase();
        System.out.println( upper );
        String lower = message.toLowerCase();
        System.out.println( lower );
        System.out.println( message );

        String subPart = message.substring( 22, 29 );
        System.out.println( subPart + "!" );

        String [] parts = message.split(" ");
        for (String str : parts) {
            System.out.print( str + " - " );
        }
        System.out.println();

        String replacement = message.replace( "String", "Truc" );
        System.out.println( replacement );

    }


    }


