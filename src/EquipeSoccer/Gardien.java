package EquipeSoccer;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Wesky Dorcenna ,  Donovan Ponce
 *
 */

public class Gardien extends Joueur {

    public Gardien(String nom, String prenom, String anneDeNaissance, double salaire) {
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
        return "\n" +"Gardien{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", anneDeNaissance=" + getAnneDeNaissance() +
                ", salaire=" + getSalaire() +
                ", Nombre de Match =" + talent +
                ", Nombre d'arrêt =" + points + "\n"
                ;
    }


}
