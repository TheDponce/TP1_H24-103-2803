package EquipeSoccer;

import java.util.Random;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */
public class Attaquant extends Joueur {

    public Attaquant(String nom, String prenom, String anneDeNaissance, double salaire) {
        super(nom, String.valueOf(salaire), anneDeNaissance, prenom);
    }

    Random rand = new Random();
    int nbMatch = rand.nextInt(25);
    int points = rand.nextInt(38);




    public int getNbMatch() {
        return nbMatch;
    }

    public void setNbMatch(int nbMatch) {
        this.nbMatch = nbMatch;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    public void AjouterMatch()
    {
        nbMatch++;
    }

    public void AjouterPoint()
    {
        points++;
    }




    @Override
    public String toString() {
        return "\n"+"Attaquant{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", anneDeNaissance=" + getAnneDeNaissance() +
                ", salaire=" + getSalaire() +
                ", Nombre de match =" + nbMatch +
                ", Nombre de but=" + points +"\n"
                ;
    }






}
