/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p2102071
 */
public class Somme2 {
    public static void calculSomme()
    {
    int somme = 0;
    
// calcule la somme des 100 premiers entiers
        for (int i = 1; i <= 100; i++)
        somme = somme + i;
// affiche le résultat à l’écran
        System.out.println(somme);
    }

public static void main(String[] args) {
        calculSomme();
}
}