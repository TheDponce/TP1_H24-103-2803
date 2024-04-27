package EquipeSoccer;

import java.util.List;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Equipe {

    String nomEquipe;
    double budget;
    List<Joueur>joueurs;




    //TODO Faire les constructeurs et methodes pour les actions suivant: Affichage
    // de l'equipe, ajout de joueur et retrait de joueur dans l'equipe
    // + Maximum d'un gardien par equipe alors creation de logique pour cela


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





}
