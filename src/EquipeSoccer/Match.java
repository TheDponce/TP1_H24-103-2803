package EquipeSoccer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Match {
    LocalDate dateMatch;
    Equipe equipe1;
    Equipe equipe2;
    int scoreEquipe1;
    int scoreEquipe2;


    public Match(String dateMatch, Equipe equipe1, Equipe equipe2) {
        this.dateMatch = LocalDate.parse(dateMatch, DateTimeFormatter.ISO_LOCAL_DATE);
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public void jouerMatch() // Jouer un match
    {
        Random rand = new Random();
        this.scoreEquipe1 = rand.nextInt(13);
        this.scoreEquipe2 = rand.nextInt(13);






    }

    //TODO Faire les constructeurs


    public LocalDate getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(LocalDate dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public int getScoreEquipe1() {
        return scoreEquipe1;
    }

    public void setScoreEquipe1(int scoreEquipe1) {
        this.scoreEquipe1 = scoreEquipe1;
    }

    public int getScoreEquipe2() {
        return scoreEquipe2;
    }

    public void setScoreEquipe2(int scoreEquipe2) {
        this.scoreEquipe2 = scoreEquipe2;
    }

    public Equipe compareResults()
    {

        if (this.scoreEquipe1 > this.scoreEquipe2) {
            return equipe1 ;
        } else if (this.scoreEquipe1 < this.scoreEquipe2) {
            return equipe2;
        } else {
            return null; // Match nul
        }

    }

    public String AfficherGagnant() //TODO Logique d'affichage de l'équipe Gagnante + son pointage
    {
        Equipe gagnant = compareResults();
        if (gagnant != null) {
            return "Équipe Gagnante: " + gagnant.getNomEquipe() ;
        } else {
            return "Le match est nul.";
        }
    }

    public String AfficherScore()
    {
        return " " +this.scoreEquipe1 + " : "+ this.scoreEquipe2;
    }


    public void UpdateStats()
    {

        /*
        Pour chaque joueur dans l'équipe
        si le joueur est un instance de Gardien/Defense/Attaquant/Entraineur
        Augmentation du nombre de points(passe,but bloqué, nb match remporté, nb de but marqué)
        Augmentation du  nombre de match en fonction du nombre de match joueur par l'équipe

         */





    }





    @Override
    public String toString() {
        Equipe equipe1 = new Equipe();
        Equipe equipe2 = new Equipe();
        equipe1.setNomEquipe(this.equipe1.getNomEquipe());
        equipe2.setNomEquipe(this.equipe2.getNomEquipe());


        return "Match{" +
                "dateMatch=" + dateMatch +
                ", equipe1=" + equipe1.getNomEquipe() +
                ", scoreEquipe1=" + scoreEquipe1 +
                ", equipe2=" + equipe2.getNomEquipe() +
                ", scoreEquipe2=" + scoreEquipe2 +
                '}';
    }
}
