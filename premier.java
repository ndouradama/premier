package mesPremiersProgramme;

import java.util.Scanner;

public class premier {
    public static void main(String[] args) {
        int a;
        int j=0;
        do {
            System.out.println("entrer un nombre positif");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
        } while (a < 0);


        for( int i=1; i<100; i++) {

            do{
                if (a % i == 0 && a % 1 == 0)


                j++;

            } while (j==2);

        }
                System.out.println("cest un nombbre premier");



    }
}
