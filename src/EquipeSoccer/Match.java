package EquipeSoccer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;


/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce

*/

        public class Match {
             Random rand = new Random();
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
                    do{
                        if (this.scoreEquipe1 > this.scoreEquipe2) {
                            return equipe1 ;
                        } else if (this.scoreEquipe1 < this.scoreEquipe2) {
                            return equipe2;
                        } else {
                            this.scoreEquipe1  = rand.nextInt(3);
                            this.scoreEquipe2 = rand.nextInt(3);
                        }return null;
                    } while (this.scoreEquipe1  !=  this.scoreEquipe2);

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






                @Override
                public String toString() {
                    String team1Name = (equipe1 != null) ? equipe1.getNomEquipe() : "Match annulé par abandon";
                    String team2Name = (equipe2 != null) ? equipe2.getNomEquipe() : "Match annulé par abandon";

                    return "Match{" +
                            "dateMatch=" + dateMatch +
                            ", equipe1=" + team1Name +
                            ", scoreEquipe1=" + scoreEquipe1 +
                            ", equipe2=" + team2Name +
                            ", scoreEquipe2=" + scoreEquipe2 +
                            '}';
                }
            }










