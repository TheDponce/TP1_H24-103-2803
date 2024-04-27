package EquipeSoccer;
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
    List<Equipe> equipes;


    //TODO Faire les constructeurs et methodes pour les actions suivant:
    // Ajout + retrait d'equipe, affichage de l'horraire des matchs
    // + leu resultat


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





}
