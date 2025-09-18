import java.util.Scanner;

public class M1E2 {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
    
        //1. Récuperation du nombre d'heures

        System.out.print("Entrez le nombre d'heures écoulé depuis minuit : ");
        int heures = clavier.nextInt();
        System.out.println(heures);

        //2. Récuperation du nombre de minutes

        System.out.print("Entrez le nombre de minutes écoulé depuis minuit : ");
        int minutes = clavier.nextInt();
        System.out.println(minutes);
       
        //3. Récuperation du nombre de secondes

        System.out.print("Entrez le nombre de secondes écoulé depuis minuit : ");
        int secondes = clavier.nextInt();
        System.out.println(secondes);

        //4. calculer le nombre de secondes depuis minuit 

        int totalSecondes = heures * 3600
        + minutes * 60
        + secondes;

        clavier.close();

    System.out.println ("Il est "+ heures + "h " + minutes + "min " + secondes + "s. Il s'est écoulé " + totalSecondes + "secondes depuis minuit. ");
    }
}