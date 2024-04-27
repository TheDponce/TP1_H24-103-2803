package EquipeSoccer;

import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Match {
    Date dateMatch;
    Equipe equipe1;
    Equipe equipe2;
    int scoreEquipe1;
    int scoreEquipe2;

    // TODO Creation de logique pour faire le Match ( scoreEquipe = Random)

    public Match(Date dateMatch, Equipe equipe1, Equipe equipe2, int scoreEquipe1, int scoreEquipe2) {
        this.dateMatch = dateMatch;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.scoreEquipe1 = scoreEquipe1;
        this.scoreEquipe2 = scoreEquipe2;


    }

    public Match()
    {

    }

    //TODO Faire les constructeurs


    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
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

    public Equipe compareResults(int score1, int score2) // Logique de determination du vainqueur
    {
        this.scoreEquipe1 = score1;
        this.scoreEquipe2 = score2;

        if (score1 > score2)
        {
            return equipe1;
        }
        else
        {
            return equipe2;
        }

    }

    public String AfficherGagnant() // Logique d'affichage de l'équipe Gagnante
    {
        return " Equipe Gagnante:  "  + compareResults(this.scoreEquipe1,this.scoreEquipe2).toString() ;
    }




    @Override
    public String toString() {
        return "Match{" +
                "dateMatch=" + dateMatch +
                ", equipe1=" + equipe1 +
                ", equipe2=" + equipe2 +
                ", scoreEquipe1=" + scoreEquipe1 +
                ", scoreEquipe2=" + scoreEquipe2 +
                '}';
    }
}
