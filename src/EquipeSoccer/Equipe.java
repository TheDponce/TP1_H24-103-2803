package EquipeSoccer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Equipe {

    String nomEquipe;
    double budget;
    List<Joueur> joueurs = new ArrayList<>();;


    //TODO Faire les constructeurs et methodes pour les actions suivant: Maximum d'un gardien par equipe alors creation de logique pour cela


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

        joueurs.add(joueur);
    }

    public void RetraitJoueur(Joueur joueur) {

        joueurs.remove(joueur);
    }

    @Override
    public String toString() {

        return  " Nom de l'équipe: " + this.nomEquipe + "Budget : " + this.budget + " Joueurs :  " + this.joueurs ;

    }
}
