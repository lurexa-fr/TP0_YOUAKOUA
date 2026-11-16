package calculator;

import java.util.Scanner;

/*
 * Nom      : YOUAKOUA Armel
 * Groupe   : BDML3
 * Cours    : Programmation en Java - TP0
 * Role     : Calculette : addition, soustraction, multiplication, division, modulo
 * Date     : 16/11/2026
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        int operande1;
        int operande2;
        int resultat = 0;

        // Exercice 2 : affichage du menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // Exercice 3 : saisie de l'operateur
        operateur = sc.nextInt();

        // Exercices 7 et 8 : operateur errone teste AVANT la saisie des operandes
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: the operator must be between 1 and 5.");
            System.exit(0);
        }

        // Exercices 4 et 5 : saisie des operandes
        System.out.println("Please enter the first number:");
        operande1 = sc.nextInt();
        System.out.println("Please enter the second number:");
        operande2 = sc.nextInt();

        // Division / modulo par zero impossible
        if ((operateur == 4 || operateur == 5) && operande2 == 0) {
            System.out.println("Error: division by zero is impossible.");
            System.exit(0);
        }

        // Exercice 6 : calcul selon l'operateur
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                resultat = operande1 / operande2;
                break;
            case 5:
                resultat = operande1 % operande2;
                break;
        }
        System.out.println("The result is : " + resultat);
    }
}
