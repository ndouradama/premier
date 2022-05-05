package mesPremiersProgramme;

import java.util.Scanner;

public class age {
    public static int age2(int annee){
        int date=2022;
        int age= date-annee;
        return age;
    }
    public static void main(String[] args) {
        int annee;
        System.out.println("donner votre année de naissance");
        Scanner sc = new Scanner(System.in);
        annee= sc.nextInt();
       // int age = age2(annee);
        System.out.println("votre age est :" +age2(annee));
    }

//    public static void age(int annee){
//        int date=2022;
//        int age= date-annee;
//        System.out.println("votre age est :" +age);
//    }

}


