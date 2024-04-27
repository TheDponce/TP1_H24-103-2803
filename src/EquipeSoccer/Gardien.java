package EquipeSoccer;

import java.util.Date;

/**
 *
 * @author Wesky Dorcenna ,  Donovan Ponce
 *
 */

public class Gardien extends Joueur {

    public Gardien(String nom, double salaire, Date anneDeNaissance, String prenom) {
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
}
