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

    public Equipe jouerTournoi(ArrayList<Equipe> pool) {
        ArrayList<Equipe> equipesRestantes = new ArrayList<>(pool);
        ArrayList<Equipe> equipeEliminee = new ArrayList<>();

        while (equipesRestantes.size() > 1) {
            equipesRestantes = jouerEtape(equipesRestantes, equipeEliminee);
        }

        return equipesRestantes.get(0);
    }

    private ArrayList<Equipe> jouerEtape(ArrayList<Equipe> equipes, ArrayList<Equipe> equipeEliminee) {
        ArrayList<Equipe> equipeGagnante = new ArrayList<>();

        for (int i = 0; i < equipes.size(); i += 2) {
            Equipe equipe1 = equipes.get(i);
            Equipe equipe2 = equipes.get(i + 1);
            Match match = new Match(equipe1, equipe2);
            Equipe gagnant = match.jouerMatch();
            equipeGagnante.add(gagnant);
            equipeEliminee.add(equipe1);
            equipeEliminee.add(equipe2);
        }

        equipeEliminee.removeAll(equipeGagnante);

        return new ArrayList<>(equipeGagnante);
    }
}

