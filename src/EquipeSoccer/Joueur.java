package EquipeSoccer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Joueur {
    private String nom;
    private String prenom;
    private LocalDate anneDeNaissance;
    private double salaire;

    //TODO creer une logique pour la position ou l'affectation du joueur


    public Joueur(String nom, String salaire, String anneDeNaissance, String prenom) {
        this.nom = nom;
        this.salaire = Double.parseDouble(salaire);
        this.anneDeNaissance = LocalDate.parse(anneDeNaissance, DateTimeFormatter.ISO_LOCAL_DATE);
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

    public LocalDate getAnneDeNaissance() {
        return anneDeNaissance;
    }

    public void setAnneDeNaissance(LocalDate anneDeNaissance) {
        this.anneDeNaissance = anneDeNaissance;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    @Override
    public String toString() {
        return "Joueur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", anneDeNaissance=" + anneDeNaissance +
                ", salaire=" + salaire +
                '}';
    }




}
