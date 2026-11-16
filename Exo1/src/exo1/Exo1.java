package exo1;

import java.util.Scanner;

/*
 * Nom      : YOUAKOUA Armel
 * Groupe   : BDML3
 * Cours    : Programmation en Java - TP0
 * Role     : Afficher un message de bienvenue personnalise
 * Date     : 16/11/2026
 */
public class Exo1 {

    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Bonjour " + prenom + " !");
        System.out.println("Au revoir " + prenom + ", a bientot !");
    }
}
