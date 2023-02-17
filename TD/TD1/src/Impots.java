/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p2102071
 */
public class Impots {
    public static double impot ( double revenu) {
// résultat = valeur de l'impôt calculée en fonction du revenu}public static
   if (revenu <= 20000) {
       revenu = 20000 * 0.05;
   }
   else if (revenu < 20000 ||  revenu <= 40000){
       revenu = (40000-20000) * 0.10;
   }
   else if (revenu <40000 || revenu <= 60000){
       revenu = (revenu - 40000) * 0.15;
   }
   else{
       revenu = revenu * 0.30;
   }
   return revenu;
}
 public static void main(String[] args) {
    System.out.print("impot : ");
    System.out.println(impot(57000));
}
}
