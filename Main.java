package mesPremiersProgramme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int age1;
        int age2;
        int a = 0;
        int b =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer l'age de awa");
        age1 = sc.nextInt();
        System.out.println("entrer l'age de modou");
        age2 = sc.nextInt();
        if (age1 > age2)  {
            b = age1-age2;
            System.out.println("awa est plus agé que modou de " +b+ " ans");}
            else if (age1 == age2 )  {
             System.out.println("ils ont le meme age");
             }
                else
                    a= age2-age1;
                    { System.out.println("modou est plus agé que awa de " +a+ " ans");}
    }
}