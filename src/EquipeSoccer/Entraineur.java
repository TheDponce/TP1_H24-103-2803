package EquipeSoccer;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Entraineur extends Joueur {

    public Entraineur(String nom, String prenom, String anneDeNaissance, double salaire ) {
        super(nom, String.valueOf(salaire), String.valueOf(anneDeNaissance), prenom);
    }
    int nbMatch;
    int points;



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
        return "\n"+"Entraineur{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", anneDeNaissance=" + getAnneDeNaissance() +
                ", salaire=" + getSalaire() +
                ", Nombre de match =" + nbMatch +
                ", Nombre de Match remporté=" + points +"\n"
                ;
    }
}
