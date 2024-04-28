import EquipeSoccer.*;

import java.util.Date;

/**
 *
 * @author Dorcenna Wesky,  Donovan Ponce
 *
 */

public class Main {
    public static void main(String[] args) {

        Gardien gardien = new Gardien("Ponce","Donovan","1991-10-15",250000);
        Equipe equipe = new Equipe();
        Attaquant attaquant1 = new Attaquant("Dorcenna","Wesky","1991-12-30",300000);
        Entraineur entraineur = new Entraineur("Debay",350000,"1930-01-01","Georges");


        equipe.setBudget(3000000);
        equipe.AjouterJoueur(entraineur); // si on commence par l'entraineur et que le budget est insuffisant, l'ajout ne se fait pas mais le message n'affiche pas non plus.
        equipe.AjouterJoueur(gardien);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        equipe.AjouterJoueur(attaquant1);
        System.out.println(equipe);

    }

/**
 *  //DONE Doit Avoir
 *
 *     // Classe de base pour un joueur avec les attributs : nom, prénom, date de naissance, salaire : DONE
 *     // Classes dérivées de la classe de base pour les rôles spécifiques (gardien, défense, attaque, Entraîneur) incluant des attributs supplémentaires tels que le nonmbre de match  et les points respectifs de chaque rôle (Nb but, Nb Arret etc). DONE
 *      //DONE création d'équipes avec un budget maximal pour l'embauche des joueurs. DONE
 *     // Fonctions pour ajouter, déplacer, afficher, insérer et supprimer des joueurs tout en respectant le budget de l'équipe. DONE
 *     // Avoir un maximum de Goaler DONE
 *
 *
 */






    //TODO
    // Méthodes pour afficher, insérer et supprimer une équipe dans un tournois
    // Affichage des résultats des tournois./
    // Joueur le match
    // Decoupage du main en fonction


}
