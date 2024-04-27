package EquipeSoccer;

import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Entraineur extends Joueur {

    public Entraineur(String nom, double salaire, Date anneDeNaissance, String prenom) {
        super(nom, salaire, String.valueOf(anneDeNaissance), prenom);
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
}
