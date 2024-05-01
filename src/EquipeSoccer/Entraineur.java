package EquipeSoccer;

import java.util.Random;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Entraineur extends Joueur {

    public Entraineur(String nom, String prenom, String anneDeNaissance, String salaire ) {
        super(nom, String.valueOf(salaire), String.valueOf(anneDeNaissance), prenom);
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
        return "\n"+"Entraineur{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", anneDeNaissance=" + getAnneDeNaissance() +
                ", salaire=" + getSalaire() +
                ", Nombre de match =" + talent +
                ", Nombre de Match remporté=" + points +"\n"
                ;
    }
}
