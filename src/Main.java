import EquipeSoccer.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    private static List<Equipe> equipes = new ArrayList<>();
    private static List<Joueur> joueurs = new ArrayList<>();

    public static void main(String[] args) {
        createEquipe();
        createJoueur();
        ajouteJoueurEquipe();

        // creation tournois
        Tournois fifa2024 = new Tournois();
        equipes.forEach(fifa2024::AjouterEquipe);

            fifa2024.Tournament();

        if (Objects.equals(fifa2024.getEquipes().toString(), "[]")) {
            fifa2024.Tournament();

        } else
            System.out.println(fifa2024.getEquipes());


    }



    private static void createEquipe() {
        // ajoute et créer les attanquant
        joueurs.add(new Attaquant("Mbappe", "Wesky", "1991-12-30", 300000));
        joueurs.add(new Attaquant("Vanasse", "Lionel", "1987-06-24", 300000));
        joueurs.add(new Attaquant("Etienne", "Cristiano", "1985-02-05", 300000));
        joueurs.add(new Attaquant("Neymar", "Patrick", "1992-02-05", 300000));

        // Ajoute et créer les gardien de la galaxy
        joueurs.add(new Gardien("Buffon", "Marie-Jose", "1978-01-28", 250000));
        joueurs.add(new Gardien("Neuer", "Ulrich", "1986-03-27", 250000));


        // ajoute et créer les defenseur
        joueurs.add(new Defense("Ramos", "Guillaume", "1986-03-30", 200000));
        joueurs.add(new Defense("Varane", "Mahmoud", "1993-04-25", 200000));
        joueurs.add(new Defense("Pique", "Gerard", "1987-02-02", 200000));
        joueurs.add(new Defense("Silva", "Adriano", "1984-09-22", 200000));
        joueurs.add(new Defense("Marcelo", "Vieira", "1988-05-12", 200000));



        // ajoute le coach
        joueurs.add(new Entraineur("Debay", "Georges", "1970-01-01", "350000"));
    }

    private static void createJoueur() {
        equipes.add(new Equipe(30000000, "Real Madrid"));
        equipes.add(new Equipe(32000000, "Manchester United"));
        equipes.add(new Equipe(34000000, "FC Barcelona"));
        equipes.add(new Equipe(35000000, "Paris Saint-Germain"));
        equipes.add(new Equipe(37000000, "Liverpool FC"));
        equipes.add(new Equipe(40000000, "Juventus FC"));
        equipes.add(new Equipe(42000000, "Bayern Munich"));
        equipes.add(new Equipe(45000000, "Manchester City"));
    }

    private static void ajouteJoueurEquipe() {
        for (Equipe equipe : equipes) {
            for (Joueur joueur : joueurs) {
                equipe.AjouterJoueur(joueur);
            }
        }
    }
}
