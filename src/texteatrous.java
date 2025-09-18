import java.util.Scanner;

public class texteatrous {
    public static void main(String[] args){
        // 1. Récuperation du premier nom commun
        Scanner clavier = new Scanner(System.in);
        // nexInt attend une entrée au clavier 
        System.out.print("Entrez le premier nom commun : ");
        String nomCommun1 = clavier.next();
        System.out.println(nomCommun1);

        // 2.Récuperation du nombre 
        
        // nexInt attend une entrée au clavier
        System.out.print("Entrez un nombre : ");
        int nombre = clavier.nextInt();
        System.out.println(nombre);

        // 3. Récuperation du second nom commun

        System.out.print("Entrez le second nom commun : ");
        int nomCommun2 = clavier.nextInt();
        System.out.println(nomCommun2);

        // 4. Récuperation de l'adjectif

        System.out.print("Entrez un adjectif : ");
        int adjectif = clavier.nextInt();
        System.out.println(adjectif);

        clavier.close();

        // 5. Affichage du résultat "Il était une fois un NOM1 qui avait NOMBRE NOM2. Cela le rendait //très ADJECTIF"
        System.out.println("Il était une fois un " + nomCommun1 + "qui avait " + nombre + "" + nomCommun2 + ". Cela le rendait très " + adjectif + ".");

    }
}