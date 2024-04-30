package EquipeSoccer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

//    public void Tournament()   TODO implementation du code tournois fait par Wesky
//    {
//        for (int i = 0; i < equipes.size(); i++) {
//            for (int j = i + 1; j < equipes.size(); j++) {
//                Match match = new Match(LocalDate.now().toString(), equipes.get(i), equipes.get(j));
//                match.jouerMatch();
//                System.out.println(match);
//                System.out.println(match.AfficherGagnant());
//            }
//        }
//
//    }



}
