package EquipeSoccer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */


public class Tournois {
    String nomTournois;
    Date debutTournois;
    Date finTournois;
    List<Equipe> equipes = new ArrayList<>();
    List<Equipe> equipePerdantes = new ArrayList<>();
    List<Equipe> equipeGagnantes = new ArrayList<>();


    //TODO Faire les constructeurs et methodes pour les actions suivant:
    // affichage de l'horraire des matchs
    // + leur resultat


    public String getNomTournois() {
        return nomTournois;
    }

    public void setNomTournois(String nomTournois) {
        this.nomTournois = nomTournois;
    }

    public Date getDebutTournois() {
        return debutTournois;
    }

    public void setDebutTournois(Date debutTournois) {
        this.debutTournois = debutTournois;
    }

    public Date getFinTournois() {
        return finTournois;
    }

    public void setFinTournois(Date finTournois) {
        this.finTournois = finTournois;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void afficheEquipes(){
        for(Equipe equipe : equipes){
            System.out.println(equipe);
        }
    }

    public void AjouterEquipe(Equipe equipe){

        equipes.add(equipe);

    }

    public void RetirerEquipe(Equipe equipe){
        equipes.remove(equipe);

    }

    public void replayTournament()
    {
        Tournament();
    }





public void Tournament() {

//    // nombre min joueur par equipe du tournois
//        Equipe equipe1 = new Equipe();
//
//
//        Equipe equipe2 = new Equipe();
//
//        if(this.getEquipes().size() != 12)
//        {
//            for (int i = 0; i < 12; i++) {
//
//                equipe1 = this.getEquipes().get(i);
//                equipe2 = this.getEquipes().get(i+1);
//        }


    try {
        while (equipes.size() > 1 ) {
            equipeGagnantes.clear();
            equipePerdantes.clear();

            for (int i = 0; i < equipes.size(); i++) {
                for (int j = i + 1; j < equipes.size(); j++) {

                    if (equipes.get(i) == null || equipes.get(j) == null) {
                        System.out.println(" ");
                        continue;
                    }

                    Match match = new Match(LocalDate.now().toString(), equipes.get(i), equipes.get(j));

                       match.jouerMatch();

                       System.out.println(match);

                       System.out.println(match.AfficherGagnant());

                       Equipe gagnat = match.compareResults();
                       Equipe perdant = (gagnat == equipes.get(i)) ? equipes.get(j) : equipes.get(i);


                       if (!equipeGagnantes.contains(gagnat)) {
                           equipeGagnantes.add(gagnat);
                       }

                       if (!equipePerdantes.contains(perdant)) {
                           equipePerdantes.add(perdant);
                       }

                    if(equipes.size() < 2 && match.AfficherGagnant() == null)
                    {
                        replayTournament();
                    }
                }
            }

            equipes = new ArrayList<>(equipeGagnantes);
            if (equipes.isEmpty() ||equipePerdantes.isEmpty() ||equipeGagnantes.isEmpty()) {

                replayTournament();
            }
        }

        try
        {
            if (equipes.size() == 1) {
                System.out.println("L'équipe gagnante du tournoi est : \033[32m" + equipes.get(0).getNomEquipe());
            }
        } catch (NullPointerException e)
        {
            System.out.println("Catched");
        }
    } catch (Exception e) {
       replayTournament();
    }

    try {
        if (equipes.isEmpty()) {

            replayTournament();
        }
    } catch (StackOverflowError e) {
        Exception StackOverflowError;

    }

}
}




