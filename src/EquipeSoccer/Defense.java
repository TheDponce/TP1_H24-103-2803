package EquipeSoccer;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Defense extends Joueur {

    public Defense(String nom, String prenom, String anneDeNaissance, double salaire) {
        super(nom, String.valueOf(salaire), anneDeNaissance, prenom);
    }
    Random rand = new Random();
    int nbMatch = rand.nextInt(25);
    int points = rand.nextInt(38);



    public int getTalent() {
        return nbMatch;
    }

    public void setTalent(int talent) {
        this.nbMatch = nbMatch;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    @Override
    public String toString() {
        return "\n"+"Defense{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", anneDeNaissance=" + getAnneDeNaissance() +
                ", salaire=" + getSalaire() +
                ", Nombre de match =" + nbMatch +
                ", Nombre de passe=" + points +"\n"
                ;
    }
}
