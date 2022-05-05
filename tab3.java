package mesPremiersProgramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tab3 {
    public static void main(String[] args) {

         int sizzetab1 , sizzetab2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("donner la taille de deux tableaux");
        sizzetab1= sc.nextInt();
        sizzetab2= sc.nextInt();
        String tab1 [] = new String[sizzetab1];
        String tab2 [] = new String[sizzetab2];

            for (int i=0 ; i<sizzetab1; i++){
                System.out.println("remplir le 1er tableau");
                tab1[i]= sc.next();
            }
            System.out.println("Les éléments du tableau 1  " + Arrays.toString(tab1));
            for (int j=0 ; j<sizzetab2; j++){
            System.out.println("remplir le 2e tableau");
            tab2[j]= sc.next();
        }
        System.out.println("Les éléments du tableau 2  " + Arrays.toString(tab2));

        String res [] = new String[ sizzetab1 + sizzetab2];
        System.arraycopy(tab1, 0, res, 0, sizzetab1);
        System.arraycopy(tab2, 0, res, sizzetab1, sizzetab2);
        System.out.println("la concaténation des 2 tableaux"  +Arrays.toString(res));


//       System.out.println("ajouter 3 nouvelles valeur dans le tableau 1");
//         for (int i=0; i<sizzetab1; i++){
//             tab1[i]= sc.next();
//         }

            String a;
            List<String> testList = new ArrayList<>(Arrays.asList(tab1));
            for (int i=0; i<sizzetab1; i++){
            System.out.println("donner un autre element");
            a = sc.next();
            testList.add(a);}


        System.out.println("Les éléments du tableau 1 " + testList);

        
        
        
    }
}
