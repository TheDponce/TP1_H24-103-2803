package EquipeSoccer;

import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Joueur {
    private String nom;
    private String prenom;
    private Date anneDeNaissance;
    private double salaire;


    public Joueur(String nom, double salaire, Date anneDeNaissance, String prenom) {
        this.nom = nom;
        this.salaire = salaire;
        this.anneDeNaissance = anneDeNaissance;
        this.prenom = prenom;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getAnneDeNaissance() {
        return anneDeNaissance;
    }

    public void setAnneDeNaissance(Date anneDeNaissance) {
        this.anneDeNaissance = anneDeNaissance;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }






}
