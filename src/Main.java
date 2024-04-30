import EquipeSoccer.*;

import java.util.ArrayList;
import java.util.Date;
/**
 *<h1> TP1 h24-103-2803</h1>
 *
 *
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Main {
    public static void main(String[] args) {

        Gardien gardien = new Gardien("Ponce","Donovan","1991-10-15",250000);
        Equipe equipe = new Equipe();
        Equipe equipe2 = new Equipe(25000000,"Real Madrid");
        Attaquant attaquant1 = new Attaquant("Dorcenna","Wesky","1991-12-30",300000);
        Entraineur entraineur = new Entraineur("Debay",350000,"1930-01-01","Georges");
        Entraineur entraineur2 = new Entraineur("Haya",450000,"1980-01-01","Michel");

        equipe.setNomEquipe("PSG");
        equipe.setBudget(30000000);
        equipe.AjouterJoueur(entraineur);
        equipe.AjouterJoueur(entraineur); // si on commence par l'entraineur et que le budget est insuffisant, l'ajout ne se fait pas mais le message n'affiche pas non plus.
        equipe.AjouterJoueur(gardien);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(new Attaquant("Messi","Lionel","1991-12-30",300000));
        equipe.AjouterJoueur(new Attaquant("Kilian","Mbappe","1991-12-30",300000));
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        //System.out.println(equipe);


        equipe2.AjouterJoueur(entraineur2);
        equipe2.AjouterJoueur(gardien);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);
        equipe2.AjouterJoueur(attaquant1);

        //System.out.println();
       // System.out.println(equipe2);
       // System.out.println();
       // System.out.println();

       // Match match = new Match("2024-04-28",equipe,equipe2);
        //System.out.println(match);
      //  System.out.println();
       // System.out.println();
        //match.jouerMatch();

        //System.out.println();
       // System.out.println();
        //System.out.println(match.AfficherGagnant());
        //System.out.println();
        //System.out.println(match);
       // System.out.println();
        //System.out.println(match.AfficherScore());

        Tournois tournois = new Tournois();


        //Match du poule A
        ArrayList<Equipe> pouleA = new ArrayList<>();
        pouleA.add(new Equipe("Réal madrid"));
        pouleA.add(new Equipe("Barcelone"));
        pouleA.add(new Equipe("Juventus"));
        pouleA.add(new Equipe("Milan Ac"));

        tournois.jouerTournoi(pouleA);


        //Match du poule B
        ArrayList<Equipe> pouleB = new ArrayList<>();
        pouleB.add(new Equipe("Manchester United"));
        pouleB.add(new Equipe("Manchester City"));
        pouleB.add(new Equipe("PSG"));
        pouleB.add(new Equipe("Bayern"));
        tournois.jouerTournoi(pouleB);














    }

/**
 *  //DONE Doit Avoir
 *
 *     // Classe de base pour un joueur avec les attributs : nom, prénom, date de naissance, salaire : DONE
 *     // Classes dérivées de la classe de base pour les rôles spécifiques (gardien, défense, attaque, Entraîneur) incluant des attributs supplémentaires tels que le nonmbre de match  et les points respectifs de chaque rôle (Nb but, Nb Arret etc). DONE
 *      //DONE création d'équipes avec un budget maximal pour l'embauche des joueurs. DONE
 *     // Fonctions pour ajouter, déplacer, afficher, insérer et supprimer des joueurs tout en respectant le budget de l'équipe. DONE
 *     // Avoir un maximum de Goaler DONE
 *     // Joueur le match
 *
 *
 */






    //TODO
    // Méthodes pour afficher, insérer et supprimer une équipe dans un tournois
    // Affichage des résultats des tournois./
    // Decoupage du main en fonction


    /**
     * Deboggage (break point + bug)
     */

}
