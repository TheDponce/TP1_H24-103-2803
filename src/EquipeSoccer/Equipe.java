package EquipeSoccer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private static final int NOMBRE_GARDIEN_MAX = 2;
    private static final int NOMBRE_ENTRAINEUR_MAX = 1;
    private static final int NOMBRE_JOUEUR_MAX = 12;

    private String nomEquipe;
    private double budget;
    private double budgetInitial;
    private int points;
    private int butsPour;
    private int butsContre;
    private int nombreGardien = 0;
    private int nombreEntraineur = 0;
    private List<Joueur> joueurs = new ArrayList<>();

    public Equipe(double budget, String nomEquipe) {
        this.budget = budget;
        this.nomEquipe = nomEquipe;
        this.budgetInitial = budget;
    }

    public Equipe(String nom) {
        this.nomEquipe = nom;
        this.points = 0;
        this.butsPour = 0;
        this.butsContre = 0;
    }

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

    public double getBudgetInitial() {
        return budgetInitial;
    }

    public void setBudgetInitial(double budgetInitial) {
        this.budgetInitial = budgetInitial;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getButsPour() {
        return butsPour;
    }

    public void setButsPour(int butsPour) {
        this.butsPour = butsPour;
    }

    public int getButsContre() {
        return butsContre;
    }

    public void setButsContre(int butsContre) {
        this.butsContre = butsContre;
    }

    public void ajouterPoints(int points) {
        this.points += points;
    }

    public void ajouterButsPour(int buts) {
        this.butsPour += buts;
    }

    public void ajouterButsContre(int buts) {
        this.butsContre += buts;
    }

    public void ajouterJoueur(Joueur joueur) {
        if (joueurs.size() < NOMBRE_JOUEUR_MAX) {
            boolean ajoute = false;
            if (joueur instanceof Entraineur) {
                if (nombreEntraineur < NOMBRE_ENTRAINEUR_MAX && getBudget() >= joueur.getSalaire()) {
                    joueurs.add(joueur);
                    nombreEntraineur++;
                    budget -= joueur.getSalaire();
                    ajoute = true;
                }
            } else if (joueur instanceof Gardien) {
                if (nombreGardien < NOMBRE_GARDIEN_MAX && getBudget() >= joueur.getSalaire()) {
                    joueurs.add(joueur);
                    nombreGardien++;
                    budget -= joueur.getSalaire();
                    ajoute = true;
                }
            } else {
                if (getBudget() >= joueur.getSalaire()) {
                    joueurs.add(joueur);
                    budget -= joueur.getSalaire();
                    ajoute = true;
                }
            }
            if (!ajoute) {
                System.out.println("Impossible d'ajouter le joueur " + joueur.getNom() + " " + joueur.getPrenom() + " à l'équipe " + getNomEquipe() + " : budget insuffisant ou limite de joueurs atteinte.");
            }
        } else {
            System.out.println("Impossible d'ajouter le joueur " + joueur.getNom() + " " + joueur.getPrenom() + " à l'équipe " + getNomEquipe() + " : limite de joueurs atteinte.");
        }
    }
}
