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

    public void afficheEquipes() {
        for (Equipe equipe : equipes) {
            System.out.println(equipe);
        }
    }

    public void AjouterEquipe(Equipe equipe) {

        equipes.add(equipe);

    }

    public void RetirerEquipe(Equipe equipe) {
        equipes.remove(equipe);

    }

    public List<Equipe> jouerTournoi(ArrayList<Equipe> pool) {
        List<Equipe> equipesRestantes = new ArrayList<>(pool);
        List<Equipe> equipesGagnantes = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Equipe equipe1 = equipesRestantes.get(i * 2);
            Equipe equipe2 = equipesRestantes.get(i * 2 + 1);
            Match match = new Match(equipe1, equipe2);
            Equipe gagnant = match.jouerMatch();
            equipesGagnantes.add(gagnant);
        }
        return equipesGagnantes;
    }

    public void jouerDemiFinales(List<Equipe> vainqueursPouleA, List<Equipe> vainqueursPouleB) {
        Match demiFinale1 = new Match(vainqueursPouleA.get(0), vainqueursPouleB.get(1));
        Match demiFinale2 = new Match(vainqueursPouleB.get(0), vainqueursPouleA.get(1));

        Equipe finaliste1 = demiFinale1.jouerMatch();
        Equipe finaliste2 = demiFinale2.jouerMatch();

        System.out.println("Finaliste 1 : " + finaliste1.getNomEquipe());
        System.out.println("Finaliste 2 : " + finaliste2.getNomEquipe());
    }


    public void jouerFinale(Equipe finaliste1, Equipe finaliste2) {
        Match matchFinale = new Match(finaliste1, finaliste2);
        Equipe championne = matchFinale.jouerMatch();
        System.out.println("Equipe championne : " + championne.getNomEquipe());
    }

}


