package EquipeSoccer;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Wesky Dorcenna ,  Donovan Ponce
 *
 */

public class Gardien extends Joueur {

    public Gardien(String nom, String prenom, String anneDeNaissance, double salaire) {
        super(nom, String.valueOf(salaire), anneDeNaissance, prenom);
    }

    Random rand = new Random();
    int talent = rand.nextInt(25);
    int points = rand.nextInt(38);



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
