package mesPremiersProgramme;


import java.util.Scanner;

public class profession {
    public static void main(String[] args) {

    String prenom ;
    String nom ;
    String profession ;
        Scanner sc= new Scanner(System.in);
     System.out.println("donner un prenom ");
      prenom =sc.nextLine();
        System.out.println("donner un nom ");
      nom = sc.nextLine();
        System.out.println("donner une profession ");
      profession =sc.nextLine();
       System.out.println(" votre prénom est " +prenom+ " ,votre nom est " +nom+ " et votre profession est " +profession);


    }
}
