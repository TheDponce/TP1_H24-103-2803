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
    private static final int NOMBRE_JOUEUR_MAX = 12;

    int nombreGardien = 0;
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

        if (joueur instanceof Gardien) {
            if (nombreGardien < NOMBRE_GARDIEN_MAX) {
                this.nombreGardien++;

                // Vérifier le budget avant d'ajouter le joueur
                if (getBudget() >= joueur.getSalaire()) {
                    joueurs.add(joueur);
                    setBudget(getBudget() - joueur.getSalaire());
                } else {
                    System.out.println("Budget Insuffisant");
                }
            } else {
                System.out.println("Nombre maximum de gardiens atteint");
            }
        } else {
            //TODO Faire une logique qui fait en sorte que nous ne perdons pas le budget initial de l'equipe ( Salaire total + delta du budget?)

            if (getBudget() >= joueur.getSalaire()) {
                joueurs.add(joueur);
                setBudget(getBudget() - joueur.getSalaire());
            } else {
                System.out.println("Budget Insuffisant");
            }
        }
    }
    }



    public void RetraitJoueur(Joueur joueur) {

        joueurs.remove(joueur);
        setBudget(getBudget() + joueur.getSalaire());
    }



    @Override
    public String toString() {

        return  " Nom de l'équipe: " + this.nomEquipe + "Budget initial : " + this.budgetInitial+ "Budget Actuel : " + this.budget+ " Joueurs :  " + this.joueurs ;

    }
}
