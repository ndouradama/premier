package mesPremiersProgramme;

import java.util.Arrays;
import java.util.Scanner;

public class fonction {
    public static void main(String[] args) {
        System.out.println("donner le nombre de données à saisir");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i=0; i<size; i++) {
            personne();
        }
    }
    public static String personne(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner votre prénom");
        String prenom= sc.nextLine();
        System.out.println("donner votre nom");
        String nom = sc.nextLine();
        System.out.println("donner votre age");
        int age = sc.nextInt();
        String person = prenom + " " + nom + " " + age ;
        System.out.println("vos données sont : " + person);
        return person ;
    }



}
