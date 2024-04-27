package EquipeSoccer;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */
public class Attaquant extends Joueur {

    public Attaquant(String nom, String prenom, String anneDeNaissance, double salaire) {
        super(nom, salaire, anneDeNaissance, prenom);
    }

    int talent;
    int points;



    public int getTalent() {
        return talent;
    }

    public void setTalent(int talent) {
        this.talent = talent;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    @Override
    public String toString() {
        return "\n"+"Attaquant{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", anneDeNaissance=" + getAnneDeNaissance() +
                ", salaire=" + getSalaire() +
                ", Nombre de match =" + talent +
                ", Nombre de but=" + points +"\n"
                ;
    }






}
