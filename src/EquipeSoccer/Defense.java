package EquipeSoccer;

import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Defense extends Joueur {

    public Defense(String nom, String prenom, String anneDeNaissance, double salaire) {
        super(nom, String.valueOf(salaire), anneDeNaissance, prenom);
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
