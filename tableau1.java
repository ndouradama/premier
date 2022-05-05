package mesPremiersProgramme;

import java.util.Arrays;
import java.util.Scanner;

public class tableau1 {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
       System.out.println("donner la taille du tableau:  ");
        number=sc.nextInt();
        String[] tab = new String[number];
        for(int i=0; i<number; i++)
        {
            System.out.println("donner le nom: " +i);
            tab[i]=sc.next();
        }
        System.out.println("informations enregistrées avec succès");
        System.out.println("Les éléments du tableau " + Arrays.toString(tab));
        System.out.println("entrer le nom à rechercher");
        String recup = sc.next();
        int j = 0;
        for(int i =0; i< number; i++){
            if (recup.equals(tab[i])){
                j++;
            }
        }
        if(j == 0) {
            System.out.println("Identifant non trouvé");
        }
        else {
            System.out.println("Identifant trouvé");
        }

    }
}
