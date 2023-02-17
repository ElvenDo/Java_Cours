/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbibliotheque;

/**
 *
 * @author p2102071
 */
public class TestBibliotheque {
  public static void main(String[] argv)
  {
      DocBibliotheque document1 = new DocBibliotheque ("004.178 K20PM" , "Introduction à Java", "J.Leblanc", 2015);
      DocBibliotheque document2 = new DocBibliotheque ("967.4987 T2480" , "Structure de Données", "M.machin", 2012);
      
      System.out.println("Informations relative au document 1 est : " + document1.getCodeArchivage() + " " + document1.getTitre() + " " +document1.getAuteur() + " " + document1.getAnnee());
      System.out.println("Informations relative au document 2 est : " + document2.getCodeArchivage() + " " + document2.getTitre() + " " +document2.getAuteur() + " " +document2.getAnnee());
  }
}
