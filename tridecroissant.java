package mesPremiersProgramme;


import java.util.Arrays;
import java.util.Collections;
public class tridecroissant {

        public static void main(String[] args)
        {
            Integer[] tab = {5, 1, 8, 0, 9, 4};

            Arrays.sort(tab, Collections.reverseOrder());

            System.out.printf("tab[] : %s", Arrays.toString(tab));
        }
    }



     //