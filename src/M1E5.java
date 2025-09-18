import java.util.Random;
import java.util.Scanner;

public class M1E5 {
    public static void main(String[] args){

        //1. Générer un nombre entre 1 et 100.

        Random rand = new Random();
        int nombrealeatoire = rand.nextInt(100) + 1;

        System.out.print("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel !: ");
        
        //2. L'utilisateur met sa réponse
         Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez votre reponse : ");
        int nombrechoisi = clavier.nextInt();
        System.out.println(nombrechoisi);
        System.out.print("vous avez choisi : " + nombrechoisi);
        clavier.close();

        //3. Afficher la réponse

        System.out.println("Le nombre auquel je pensais était : " + nombrealeatoire);

        //4. Comparer les deux reponses 

        int difference = nombrealeatoire - nombrechoisi;
        System.out.println("vous étiez a : " + difference + " de la bonne réponse !");

        
    }
}

      