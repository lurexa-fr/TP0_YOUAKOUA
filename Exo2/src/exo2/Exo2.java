package exo2;

import java.util.Scanner;

/*
 * Nom      : YOUAKOUA Armel
 * Groupe   : BDML3
 * Cours    : Programmation en Java - TP0
 * Role     : Additionner les nb premiers entiers (bug de boucle infinie corrige)
 * Date     : 16/11/2026
 */
public class Exo2 {

    public static void main(String[] args) {

        //Declaration des variables
        int nb; // nombre d entiers a additionner
        int result; // resultat
        int ind; //indice
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb = sc.nextInt(); // On demande a sc de donner le prochain entier
        result = 0;

        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind = ind + 1; // CORRECTION : sans cette ligne, ind reste a 1 -> boucle infinie
        }

        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est: " + result);
    }
}
