package EquipeSoccer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Equipe {
   private static final int NOMBRE_GARDIEN_MAX = 2;
    private static final int NOMBRE_ENTRAINEUR_MAX = 1;

    private static final int NOMBRE_JOUEUR_MAX = 12;

    int nombreGardien = 0;
    int nombreEntraineur = 0;
    String nomEquipe;
    double budget;
    double budgetInitial;

    List<Joueur> joueurs = new ArrayList<>();

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


    public void AjouterJoueur(Joueur joueur) {

        if (joueurs.size() < NOMBRE_JOUEUR_MAX) {
            boolean added = false; // Un drapeau pour suivre si le joueur a été ajouté

            if (joueur instanceof Entraineur) {
                if (nombreEntraineur < NOMBRE_ENTRAINEUR_MAX && getBudget() >= joueur.getSalaire()) {
                    this.nombreEntraineur++;
                    joueurs.add(joueur);
                    added = true; // Marque le joueur comme ajouté
                } else if (nombreEntraineur > NOMBRE_ENTRAINEUR_MAX){

                    System.out.println("Nombre maximum d'entraineur atteint");

                }

            }

            if (joueur instanceof Gardien && !added) { // Vérifie si ce n'est pas déjà un entraîneur
                if (nombreGardien < NOMBRE_GARDIEN_MAX) {
                    this.nombreGardien++;

                    if (getBudget() >= joueur.getSalaire()) {
                        joueurs.add(joueur);
                        setBudget(getBudget() - joueur.getSalaire());
                        added = true; // Marque le joueur comme ajouté
                    } else {
                        System.out.println("Budget Insuffisant");
                    }
                } else {
                    System.out.println("Nombre maximum de gardiens atteint");
                }
            }

            if (!added && !(joueur instanceof Entraineur || joueur instanceof Gardien)) { // Ajoute des joueurs réguliers si non gardien/entraineur
                if (getBudget() >= joueur.getSalaire()) {
                    joueurs.add(joueur);
                    setBudget(getBudget() - joueur.getSalaire());
                } else {
                    System.out.println("Budget Insuffisant"); // condition qui fait que nous n'affichons pas le nombre de joueur si le max est atteint, affiche budget max attein au lieu
                }
            }

        } else {
            System.out.println("Nombre maximum de joueurs atteint");
        }



    }




    public void RetraitJoueur(Joueur joueur) {

        joueurs.remove(joueur);
        setBudget(getBudget() + joueur.getSalaire());
    }



    @Override
    public String toString() {

        return  " Nom de l'équipe: " + this.nomEquipe + "Budget initial : " + this.budgetInitial+"Nombre de jouueur"+ this.joueurs.size()+ "Budget Actuel : " + this.budget+ " Joueurs :  " + this.joueurs ;

    }
}
