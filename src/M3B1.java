import java.util.Scanner;

public class M3B1{
    public static void main(String[] args){

//1. L'utilisateur rentre le stock initial

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le stock initial : ");
        int stockInitial = clavier.nextInt();

//2. L'utilisateur rentre le seuil d'alerte

        System.out.print("Entrez le seuil d'alerte : ");
        int seuilAlerte = clavier.nextInt();

//3. L'utilisateur rentre le nombre de jours a simuler

        System.out.print("Entrez le nombre de jours a simuler : ");
        int simulation = clavier.nextInt();

//4. Simuler le Jour 1

        for (int jour = 1; jour <= simulation; jour++) {
      
                System.out.println("--- Jour " + jour);

                System.out.print("Entrez le nombre de produit recu : ");
                 int reception = clavier.nextInt();
           
                 stockInitial = stockInitial + reception;
       
                System.out.print("Entrez le nombre de vente : ");
                int vente = clavier.nextInt();
                 
                stockInitial = stockInitial - vente;

                System.out.println("Le stock actuel est de : "+ stockInitial);



// Vérifier le seuil d'alerte

        if (stockInitial < seuilAlerte && stockInitial >= 0) {
                System.out.println("Alerte : Le stock est en dessous du seuil d'alerte !");
            }

        if (stockInitial < 0 ) {
                System.out.println("ERREUR : le stock est négatif. Simulation arrêtée.");
                break;
            }

        }
    clavier.close();
    }
}
