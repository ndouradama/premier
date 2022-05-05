package mesPremiersProgramme;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tab2 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
       // num= sc.nextInt();
      System.out.println( "donner la taille du tableau " );
      int sizze = sc.nextInt();

        int [] tab = new int[sizze];
        for (int i= 0; i<sizze; i++){
            //System.out.println("remplir le tableau " );
            do {
                System.out.println("remplir le tableau " );
                if (tab[i]<0)
                {
                    System.out.println("valeur incorrecte " );
                }
                tab[i] = sc.nextInt();
            } while (tab[i]  < 0 );
        }
        System.out.println("tableau enregistré avec succes");
        System.out.println("Les éléments du tableau " + Arrays.toString(tab));
        Arrays.sort(tab);
        //System.out.println("voici le tableau trié dans l'ordre croissant");
        for(int i=0; i<sizze; i++){
            System.out.println( + tab[i]);
        }
        System.out.println("Les éléments du tableau  trié" + Arrays.toString(tab));

        int somme=0  , moyenne , plusgrandnum , pluspetitnum ;
        for(int i =0 ; i< sizze; i++){
            somme= somme + tab[i];
        }
        System.out.println("la somme est " +somme);
         moyenne = somme /sizze;
        System.out.println("la moyenne est " +moyenne);
        Arrays.sort(tab);

        plusgrandnum = tab[tab.length -1];
       pluspetitnum = tab[0];
        System.out.println("le plus grand nombre est " +plusgrandnum);
        System.out.println("le plut petit nombre est " +pluspetitnum);

        Integer[] a = new Integer[3];
        String b = "rghjhhjk,ggff";
        String[] c = b.split(",");
        System.out.println(c[0]);
        System.out.println(c[1]);

    }
}
