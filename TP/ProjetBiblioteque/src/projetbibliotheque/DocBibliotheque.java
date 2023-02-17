
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
public class DocBibliotheque {
    private String codeArchivage;
    private String titre;
    private String auteur;
    private int annee;
    private String statutPhysique;
    private boolean reservation;
    
    //constructeur
    DocBibliotheque(String newCodeArchivage, String newTitre, String newAuteur, int newAnnee){
        codeArchivage = newCodeArchivage;
        titre = newTitre;
        auteur = newAuteur;
        annee = newAnnee;
        statutPhysique = "étagère"; // initialement mit sur l'étagère
        reservation = false;
    }
   
    //accesseur
    public String getCodeArchivage(){
        return codeArchivage;
    }
    public String getTitre(){
        return titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public int getAnnee(){
        return annee;
    }
    public String getStatutPhysique(){
        return statutPhysique;
    }
    public boolean getReservation(){
        return reservation;
    }
    
    //mutateur
    public void setCodeArchivage(String codeArchivage){
        this.codeArchivage = codeArchivage;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    public void setAnnee(int annee){
        this.annee = annee;
    }
    public void setStatutPhysique(String statutPhysique){
        this.statutPhysique = statutPhysique;       
    }
    public void setReservation(boolean reservation){
        this.reservation = reservation;
    }
    
    public boolean Emprunt(){
        boolean statutEmprunt = false; //initialement le document ce situe sur l'étagère
        if("étagère".equals(statutPhysique) || "réservation".equals(statutPhysique)){
            statutPhysique = "emprunté";
            statutEmprunt = true;
        } 
        return statutEmprunt;
    }
    
    public boolean Retour(){
        boolean statutRetour = false; //mit à false car le documents n'est pas encore revenu
        if("emprunté".equals(statutPhysique)){
            if(reservation == false){
              statutPhysique = "pile des retours";
              statutRetour = true;
            }
            else{
                statutPhysique = "réservation";
                reservation = true;
            }
        }
        return statutRetour;
    }
   
    public boolean Reservation(){
        boolean statutReservation = false; //initialement le document n'est pas réservés
        if(reservation == false && "emprunté".equals(statutPhysique)){
            reservation = true;
            statutReservation = true;
        }
       return statutReservation;
    }
    
    public boolean annulationReservation(){
        boolean statutAnnulationReservation = false; //initialement le document n'est pas réservés donc sa réservations ne peut être annulé
        if("emprunté".equals(statutPhysique) && reservation == true || "réservation".equals(statutPhysique)){
            reservation = false;
            statutAnnulationReservation = true;
            statutPhysique = "pile des retours";
        }
        return statutAnnulationReservation;
    }
    
    public boolean Remise(){
        boolean statutRemise = false;
        if("pile des retours".equals(statutPhysique)){
            statutRemise = true;
            statutPhysique = "étagère";
        }
        return statutRemise;
    }
    
    public  String EstEmprunte(){
        
        
    }
}
