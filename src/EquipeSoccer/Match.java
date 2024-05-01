package EquipeSoccer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Match {
    private LocalDate dateMatch;
    private Equipe equipe1;
    private Equipe equipe2;
    private int scoreEquipe1;
    private int scoreEquipe2;

    public Match(String dateMatch, Equipe equipe1, Equipe equipe2) {
        this.dateMatch = LocalDate.parse(dateMatch, DateTimeFormatter.ISO_LOCAL_DATE);
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public Match(Equipe equipe1, Equipe equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    public Equipe getPerdante() {
        if (scoreEquipe1 > scoreEquipe2) {
            return equipe2;
        } else if (scoreEquipe1 < scoreEquipe2) {
            return equipe1;
        } else {
            return null; // Match nul
        }
    }

    public Equipe jouerMatch() {
        while (true) {
            int score1 = (int) (Math.random() * 5);
            int score2 = (int) (Math.random() * 5);
            System.out.println(equipe1.getNomEquipe() + ": " + score1 + "-" + score2 + " " + equipe2.getNomEquipe());
            if (score1 > score2) {
                return equipe1;
            } else if (score2 > score1) {
                return equipe2;
            }
            // Si le match est nul, réessayer jusqu'à ce qu'il y ait un gagnant
        }
    }

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

    public Equipe compareResults() {
        if (this.scoreEquipe1 > this.scoreEquipe2) {
            return equipe1;
        } else if (this.scoreEquipe1 < this.scoreEquipe2) {
            return equipe2;
        } else {
            return null; // Match nul
        }
    }

    public String afficherGagnant() {
        Equipe gagnant = compareResults();
        if (gagnant != null) {
            return "Équipe Gagnante: " + gagnant.getNomEquipe();
        } else {
            return "Le match est nul.";
        }
    }

    public String afficherScore() {
        return " " + this.scoreEquipe1 + " : " + this.scoreEquipe2;
    }

    public void mettreAJourStatistiques() {
        // Mettre à jour les statistiques des joueurs
    }
}
